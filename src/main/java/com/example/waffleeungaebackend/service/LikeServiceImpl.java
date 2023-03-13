package com.example.waffleeungaebackend.service;

import com.example.waffleeungaebackend.entity.Post;
import com.example.waffleeungaebackend.repository.LikeRepository;
import com.example.waffleeungaebackend.repository.PostRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class LikeServiceImpl implements LikeService{
    private final LikeRepository likeRepository;
    private final PostRepository postRepository;

    @Transactional
    public void like(Long post_id, Long member_id) {
        likeRepository.mSave(post_id, member_id);
        Post post = postRepository.findById(post_id).orElseThrow(() -> new IllegalArgumentException("유저정보가 없습니다."));
    }

    @Transactional
    public void unlike(Long post_id, Long member_id) {
        likeRepository.mDelete(post_id, member_id);
    }
}
