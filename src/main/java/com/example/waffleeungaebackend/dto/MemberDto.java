package com.example.waffleeungaebackend.dto;

import com.example.waffleeungaebackend.entity.Member;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class MemberDto implements Serializable {
    private Long memberId;
    private String name;
    private String email;

    public MemberDto(Member member) {
        this.memberId = member.getMemberId();
        this.name = member.getName();
        this.email = member.getEmail();
    }
}
