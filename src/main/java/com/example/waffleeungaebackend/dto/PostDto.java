package com.example.waffleeungaebackend.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@Builder
public class PostDto {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createDate;
    private Long categoryId;

}
