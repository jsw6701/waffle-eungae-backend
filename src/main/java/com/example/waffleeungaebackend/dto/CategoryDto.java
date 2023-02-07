package com.example.waffleeungaebackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@Getter
public class CategoryDto {
    @Getter
    @AllArgsConstructor
    @ToString
    public static class AddCategory{
        @NonNull
        private String categoryName;
    }

    @Getter
    @AllArgsConstructor
    @ToString
    public static class PatchCategory{
        @NonNull
        private String categoryName;
    }

    @Getter
    @AllArgsConstructor
    @ToString
    public static class ResponseCategory{
        private Long categoryId;
        private String categoryName;
    }
}
