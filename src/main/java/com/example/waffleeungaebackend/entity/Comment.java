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
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // 댓글 아이디
    private Long commentId;

    // 댓글 내용
    private String content;

    // 좋아요
    private Integer like;

    // 작성일
    private LocalDateTime createDate;

    @ManyToOne
    @JoinColumn(name = "memberId")
    // 작성자 아이디
    private Member member;

    @ManyToOne
    @JoinColumn(name = "postId")
    // 게시글 아이디
    private Post post;

    @ManyToOne
    @JoinColumn(name = "parentId")
    // 부모 댓글
    private Comment comment;
}
