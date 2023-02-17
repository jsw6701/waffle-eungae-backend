package com.example.waffleeungaebackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

import java.time.LocalDateTime;

public class PostDto {

    @Getter
    @AllArgsConstructor
    @ToString
    public static class AddPost{
        @NonNull
        private String title;
        private String content;
        private CategoryDto category;
        private Boolean status;
    }
    @Getter
    @AllArgsConstructor
    @ToString
    public static class PatchPost{
        @NonNull
        private String title;
        private String content;
        private CategoryDto category;
        private Boolean status;
    }
    @Getter
    @AllArgsConstructor
    @ToString
    public static class ResponsePost{
        private Long postId;
        private String title;
        private String content;
        private LocalDateTime createDate;
        private MemberDto member;
        private CategoryDto category;
        private Boolean status;
    }
}
