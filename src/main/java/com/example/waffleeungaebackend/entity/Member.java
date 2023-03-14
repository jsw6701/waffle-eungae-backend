package com.example.waffleeungaebackend.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Entity
public class Member extends BaseTimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // 유저 아이디
    private Long memberId;

    @Column
    // 유저 이름
    private String name;

    @Column
    // 유저 이메일
    private String email;

    @Enumerated(EnumType.STRING)
    @Column
    private Role role;


    /* 소셜로그인시 이미 등록된 회원이라면 수정날짜만 업데이트하고
    * 기존 데이터는 그대로 보존하도록 예외처리 */
    public Member updateModifiedDate() {
        this.onPreUpdate();
        return this;
    }
    /*
    @Builder
    public Member(String name, String email, Role role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }


 */
    public Member update(String name ) {
        this.name = name;
        return this;
    }


    public String getRoleKey() {
        return this.role.getKey();
    }

}
