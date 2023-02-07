package com.example.waffleeungaebackend.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // 게시글 아이디
    private Long postId;

    // 게시글 제목
    private String title;

    // 게시글 내용
    private String content;

    // 작성일
    private LocalDateTime createDate;

    @ManyToOne
    @JoinColumn(name = "memberId")
    // 작성자 아이디
    private Member member;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    // 카테고리 아이디
    private Category category;

    // 상태
    private Boolean status;
}
