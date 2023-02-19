package com.example.waffleeungaebackend.dto.request;

import com.example.waffleeungaebackend.entity.Comment;
import com.example.waffleeungaebackend.entity.Post;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
public class CommentRequestDto {
    @NotEmpty(message = "내용은 필수 항목입니다.")
    private String content;

    private LocalDateTime createDate;

    private Long postId;

    public Comment toEntity(Post post){
        return Comment.builder()
                .content(content)
                .createDate(LocalDateTime.now())
                .post(post)
                .build();
    }
}
