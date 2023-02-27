package com.example.waffleeungaebackend.dto;

import com.example.waffleeungaebackend.entity.Category;
import com.example.waffleeungaebackend.entity.Post;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Builder
public class PostDto {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createDate;
    private Category category;

    public PostDto(Post post){
        this.id = post.getPostId();
        this.title = post.getTitle();
        this.content = post.getContent();
        this.createDate = post.getCreateDate();
        this.category = post.getCategory();
    }
}
