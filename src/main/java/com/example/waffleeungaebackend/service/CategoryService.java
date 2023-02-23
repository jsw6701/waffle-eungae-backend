package com.example.waffleeungaebackend.service;

import com.example.waffleeungaebackend.dto.CategoryDto;
import com.example.waffleeungaebackend.dto.request.CategoryCreateRequestDto;
import com.example.waffleeungaebackend.entity.Category;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface CategoryService {

    Category findById(Long id);

    void addCategoryList(CategoryCreateRequestDto categoryCreateRequestDto);

    void deleteCategoryList(Long id);

    List<CategoryDto> findCategoryList(Sort sort);
}
