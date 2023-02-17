package com.example.waffleeungaebackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@Getter
public class MemberDto {
    @Getter
    @AllArgsConstructor
    @ToString
    public static class AddMember{
        @NonNull
        private String email;
        private String password;
        private String name;
    }
    @Getter
    @AllArgsConstructor
    @ToString
    public static class PatchMember{
        @NonNull
        private String name;
        private String password;
    }

    @Getter
    @AllArgsConstructor
    @ToString
    public static class ResponseMember{
        private Long memberId;
        private String email;
        private String password;
        private String name;
    }
}
