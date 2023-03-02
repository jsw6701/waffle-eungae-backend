package com.example.waffleeungaebackend.dto.request;

import com.example.waffleeungaebackend.entity.Category;
import com.example.waffleeungaebackend.entity.Post;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
public class PostCreateRequestDto {

    private Long id;

    @NotEmpty(message="제목은 필수 항목입니다.")
    @Size(max=200)
    private String title;

    @NotEmpty(message="내용은 필수 항목입니다.")
    private String content;


    public Post toEntity(Category category) {

        return Post.builder()
                .postId(id)
                .title(title)
                .content(content)
                .createDate(LocalDateTime.now())
                .category(category)
                .build();
    }
}
