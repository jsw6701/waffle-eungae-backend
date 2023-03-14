package com.example.waffleeungaebackend.dto.request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LikeRequestDto {

    private Long memberId;
    private Long boardId;

    public LikeRequestDto(Long memberId, Long boardId) {
        this.memberId = memberId;
        this.boardId = boardId;
    }
}