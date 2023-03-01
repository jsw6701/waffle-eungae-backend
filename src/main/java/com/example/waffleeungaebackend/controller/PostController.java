package com.example.waffleeungaebackend.controller;

import com.example.waffleeungaebackend.dto.PostDto;
import com.example.waffleeungaebackend.dto.request.PostCreateRequestDto;
import com.example.waffleeungaebackend.dto.request.PostPatchRequestDto;
import com.example.waffleeungaebackend.entity.Post;
import com.example.waffleeungaebackend.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@AllArgsConstructor
@RestController
@RequestMapping("/post")
public class PostController {

    private PostService postService;

    @PostMapping("{categoryId}")
    public ResponseEntity<PostDto> create(@RequestBody PostCreateRequestDto postCreateRequestDto, @PathVariable Long categoryId){
        System.out.println("create");

        Post post = this.postService.addPostList(postCreateRequestDto, categoryId);
        return ResponseEntity.ok(new PostDto(post));
    }

    @PatchMapping("{id}")
    public ResponseEntity<PostDto> update(@PathVariable Long id, @RequestBody PostPatchRequestDto patchRequestDto){
        System.out.println("update");

        Post post = postService.updateById(id, patchRequestDto);
        return ResponseEntity.ok(new PostDto(post));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        System.out.println("delete");

        this.postService.deletePostList(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Page<PostDto>> readAll(@PageableDefault(sort = "id", direction = Sort.Direction.DESC) Pageable pageable){
        System.out.println("read all");

        Page<PostDto> postList = this.postService.findPostList(pageable);

        return ResponseEntity.ok(postList);
    }
}
