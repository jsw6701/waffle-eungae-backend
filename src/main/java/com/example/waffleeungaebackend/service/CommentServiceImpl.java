package com.example.waffleeungaebackend.service;

import com.example.waffleeungaebackend.dto.CommentDto;
import com.example.waffleeungaebackend.dto.request.CommentRequestDto;
import com.example.waffleeungaebackend.entity.Comment;
import com.example.waffleeungaebackend.entity.Post;
import com.example.waffleeungaebackend.repository.CommentRepository;
import com.example.waffleeungaebackend.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CommentServiceImpl implements CommentService{

    private CommentRepository commentRepository;

    private PostRepository postRepository;

    @Override
    public Comment addComment(CommentRequestDto commentRequestDto, Long postId) {
        Post post = postRepository.findById(postId).orElseThrow(() -> new IllegalArgumentException("댓글 생성 실패"));


        return commentRepository.save(commentRequestDto.toEntity(post));

    }

    @Override
    public List<CommentDto> getCommentList(Long postId) {
        List<Comment> commentList = commentRepository.findByPostId(postId);
        return commentList.stream().map(Comment::toDto).collect(Collectors.toList());

    }
}
