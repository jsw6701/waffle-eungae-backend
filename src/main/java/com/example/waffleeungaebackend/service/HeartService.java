package com.example.waffleeungaebackend.service;



public interface HeartService {
    void like(Long post_id, Long member_id);
    void unlike(Long post_id, Long member_id);
}
