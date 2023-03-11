package com.example.waffleeungaebackend.service;

import com.example.waffleeungaebackend.controller.LoginUser;
import com.example.waffleeungaebackend.dto.PostDto;
import com.example.waffleeungaebackend.dto.SessionMember;
import com.example.waffleeungaebackend.dto.request.PostCreateRequestDto;
import com.example.waffleeungaebackend.dto.request.PostPatchRequestDto;
import com.example.waffleeungaebackend.entity.Member;
import com.example.waffleeungaebackend.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PostService {

    Post findById(Long id);

    Post addPostList(PostCreateRequestDto postCreateRequestDto, Long categoryId, String memberName);

    void deletePostList(Long id);

    Post updateById(Long id, PostPatchRequestDto postPatchRequestDto);

    Page<PostDto> findPostList(Pageable pageable);


    List<PostDto> findAllDesc();

}
