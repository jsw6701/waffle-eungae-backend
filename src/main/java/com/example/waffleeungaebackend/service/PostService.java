package com.example.waffleeungaebackend.service;

import com.example.waffleeungaebackend.dto.PostDto;
import com.example.waffleeungaebackend.dto.request.PostCreateRequestDto;
import com.example.waffleeungaebackend.entity.Category;
import com.example.waffleeungaebackend.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PostService {

    Post findById(Long id);

    void addPostList(PostCreateRequestDto postCreateRequestDto, Category category);

    void deletePostList(Long id);

    Page<PostDto> findPostList(Pageable pageable);
}
