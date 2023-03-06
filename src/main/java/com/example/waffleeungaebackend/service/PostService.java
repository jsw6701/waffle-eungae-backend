package com.example.waffleeungaebackend.service;

import com.example.waffleeungaebackend.entity.Post;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface PostService {

    Post findById(Long id);

    void addPostList(Post post);

    void deletePostList(Long id);

    Post updateById(Long id, PostPatchRequestDto postPatchRequestDto);

    Page<PostDto> findPostList(Pageable pageable);

    List<PostDto> findAllDesc();
}
