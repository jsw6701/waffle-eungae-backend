package com.example.waffleeungaebackend.dto.request;

import com.example.waffleeungaebackend.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotEmpty;

@Getter
@Builder
@AllArgsConstructor
public class CategoryCreateRequestDto {

    @NotEmpty(message = "카테고리는 필수 항목입니다.")
    private String categoryName;

    public Category toEntity(){
        return Category.builder()
                .categoryName(categoryName)
                .build();
    }
}
