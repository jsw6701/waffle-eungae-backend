package com.example.waffleeungaebackend.repository;

import com.example.waffleeungaebackend.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {


}
