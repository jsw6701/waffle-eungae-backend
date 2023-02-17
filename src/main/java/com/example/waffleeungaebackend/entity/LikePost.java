package com.example.waffleeungaebackend.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class LikePost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // 좋아요 아이디
    private Long likePostId;

    @ManyToOne
    @JoinColumn(name = "postId")
    // 게시글 아이디
    private Post post;

    @ManyToOne
    @JoinColumn(name = "memberId")
    // 유저 아이디
    private Member member;

}
