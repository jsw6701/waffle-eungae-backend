package com.example.waffleeungaebackend.service;

import com.example.waffleeungaebackend.entity.Post;
import com.example.waffleeungaebackend.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService{

    private final PostRepository postRepository;

    @Override
    public Post findById(Long id) {
        return postRepository.findById(id).orElse(new Post());
    }

    @Override
    public void addPostList(Post post) {

        postRepository.save(post);
    }

    @Override
    public void deletePostList(Long id) {
        postRepository.deleteById(id);
    }

    @Override
    public List<Post> findPostList(Sort sort) {
        return postRepository.findAll(sort);
    }

    @Override
    public List<PostDto> findAllDesc() {
        return postRepository.findAllDesc().stream()
            .map(PostDto::new)
            .collect(Collectors.toList());
    }
}
