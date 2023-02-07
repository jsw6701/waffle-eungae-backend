package com.example.waffleeungaebackend.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // 유저 아이디
    private Long memberId;

    // 유저 이메일
    private String email;

    // 유저 비밀번호
    private String password;

    // 유저 이름
    private String name;
}
