package com.example.waffleeungaebackend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class CategoryDto {

    private Long categoryId;

    private String categoryName;

}
