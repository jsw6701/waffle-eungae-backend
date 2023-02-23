package com.example.waffleeungaebackend.service;

import com.example.waffleeungaebackend.dto.PostDto;
import com.example.waffleeungaebackend.dto.request.PostRequestDto;
import com.example.waffleeungaebackend.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PostService {

    Post findById(Long id);

    void addPostList(PostRequestDto postRequestDto);

    void deletePostList(Long id);

    Page<PostDto> findPostList(Pageable pageable);
}
