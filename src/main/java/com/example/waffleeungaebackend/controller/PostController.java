package com.example.waffleeungaebackend.controller;

import com.example.waffleeungaebackend.config.login.LoginUser;
import com.example.waffleeungaebackend.dto.PostDto;
import com.example.waffleeungaebackend.dto.MemberDto;
import com.example.waffleeungaebackend.dto.request.FileRequestDto;
import com.example.waffleeungaebackend.dto.request.PostCreateRequestDto;
import com.example.waffleeungaebackend.dto.request.PostPatchRequestDto;

import com.example.waffleeungaebackend.entity.Post;
import com.example.waffleeungaebackend.service.FileService;
import com.example.waffleeungaebackend.service.PostService;
import com.example.waffleeungaebackend.util.MD5Generator;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

@CrossOrigin
@AllArgsConstructor
@RestController
@RequestMapping("/post")
public class PostController {

    private final PostService postService;
    private final FileService fileService;

    @PostMapping("{categoryId}")
    public ResponseEntity<PostDto> create(
            @RequestBody PostCreateRequestDto postCreateRequestDto,
            @PathVariable Long categoryId,
            @LoginUser MemberDto member,
            @RequestParam("file")MultipartFile files){

        System.out.println("create");

        try{
            String origFilename = files.getOriginalFilename();
            String filename = new MD5Generator(origFilename).toString();
            /* 실행되는 위치의 'files' 폴더에 파일이 저장됩니다. */
            String savePath = System.getProperty("user.dir") + "\\files";
            /* 파일이 저장되는 폴더가 없으면 폴더를 생성합니다. */
            if (!new File(savePath).exists()) {
                try{
                    new File(savePath).mkdir();
                }
                catch(Exception e){
                    e.getStackTrace();
                }
            }
            String filePath = savePath + "\\" + filename;
            files.transferTo(new File(filePath));

            FileRequestDto fileRequestDto = new FileRequestDto();
            fileRequestDto.setOrigFilename(origFilename);
            fileRequestDto.setFilename(filename);
            fileRequestDto.setFilePath(filePath);

            Long fileId = fileService.saveFile(fileRequestDto);

            Post post = this.postService.addPostList(postCreateRequestDto, categoryId, member.getMemberId(), fileId);
            return ResponseEntity.ok(new PostDto(post));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @PatchMapping("{id}")
    public ResponseEntity<PostDto> update(@PathVariable Long id, @RequestBody PostPatchRequestDto patchRequestDto, @LoginUser MemberDto member){
        System.out.println("update");

        Post post = postService.updateById(id, patchRequestDto, member.getMemberId());
        return ResponseEntity.ok(new PostDto(post));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable Long id, @LoginUser MemberDto member){
        System.out.println("delete");

        this.postService.deletePostList(id, member.getMemberId());
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Page<PostDto>> readAll(@PageableDefault(sort = "createDate", direction = Sort.Direction.DESC) Pageable pageable){
        System.out.println("read all");

        Page<PostDto> postList = this.postService.findPostList(pageable);

        return ResponseEntity.ok(postList);
    }
}
