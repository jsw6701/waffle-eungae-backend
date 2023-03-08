package com.example.waffleeungaebackend.controller;

import com.example.waffleeungaebackend.dto.CommentDto;
import com.example.waffleeungaebackend.dto.request.CommentRequestDto;
import com.example.waffleeungaebackend.entity.Comment;
import com.example.waffleeungaebackend.service.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@AllArgsConstructor
@RestController
@RequestMapping("/comment")
public class CommentController {

    private final CommentService commentService;

    @PostMapping("{postId}")
    public ResponseEntity<CommentDto> create(@RequestBody CommentRequestDto commentRequestDto, @PathVariable Long postId){
        Comment comment = this.commentService.addComment(commentRequestDto, postId);
        return ResponseEntity.ok(comment.toDto());
    }

    @GetMapping("{postId}")
    public ResponseEntity<List<CommentDto>> readAllByPostId(@PathVariable Long postId){
        List<CommentDto> commentDtoList = this.commentService.getCommentList(postId);
        return ResponseEntity.ok(commentDtoList);
    }
}
