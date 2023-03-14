package com.example.waffleeungaebackend.entity;

import lombok.*;

import javax.persistence.*;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Data
@Builder
@Entity
public class LikePost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // 좋아요 아이디
    private Long likePostId;

    @ManyToOne
    @JoinColumn(name = "post_id")
    // 게시글 아이디
    private Post post;

    @ManyToOne
    @JoinColumn(name = "member_Id")
    // 유저 아이디
    private Member member;

}
