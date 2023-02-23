package com.example.waffleeungaebackend.service;

import com.example.waffleeungaebackend.dto.PostDto;
import com.example.waffleeungaebackend.dto.request.PostRequestDto;
import com.example.waffleeungaebackend.entity.Post;
import com.example.waffleeungaebackend.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService{

    private final PostRepository postRepository;

    @Override
    public Post findById(Long id) {
        return postRepository.findById(id).orElse(new Post());
    }


    @Override
    public void addPostList(PostRequestDto postRequestDto) {
        postRepository.save(postRequestDto.toEntity());
    }

    @Override
    public void deletePostList(Long id) {
        postRepository.deleteById(id);
    }

    @Override
    public Page<PostDto> findPostList(Pageable pageable) {
        return postRepository.findAll(pageable).map(Post::toDto);
    }
}
