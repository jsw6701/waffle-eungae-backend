package com.example.waffleeungaebackend.service;

import com.example.waffleeungaebackend.dto.PostDto;
import com.example.waffleeungaebackend.dto.request.PostRequestDto;
import com.example.waffleeungaebackend.entity.Post;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface PostService {

    Post findById(Long id);

    void addPostList(PostRequestDto postRequestDto);

    void deletePostList(Long id);

    List<PostDto> findPostList(Sort sort);
}
