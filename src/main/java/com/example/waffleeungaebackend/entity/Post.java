package com.example.waffleeungaebackend.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
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

    // 상태
    private Boolean status;

/*    @ManyToOne
    @JoinColumn(name = "memberId")
    // 작성자 아이디
    private Member member;*/

    @ManyToOne
    @JoinColumn(name = "categoryId")
    // 카테고리 아이디
    private Category category;

    @OneToMany(mappedBy = "post", cascade = CascadeType.REMOVE)
    private List<Comment> commentList = new ArrayList<>();

    @Builder
    public Post(String title, String content, LocalDateTime createDate){
        this.title = title;
        this.content = content;
        this.createDate = createDate;
    }
}
