package com.example.waffleeungaebackend.entity;

import com.example.waffleeungaebackend.dto.CategoryDto;
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
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // 카테고리 아이디
    private Long categoryId;

    // 카테고리 이름
    private String categoryName;

    public CategoryDto toDto() {
        return CategoryDto.builder()
                .categoryName(categoryName)
                .build();
    }
}
