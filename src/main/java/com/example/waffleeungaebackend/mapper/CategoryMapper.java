package com.example.waffleeungaebackend.mapper;

import com.example.waffleeungaebackend.dto.CategoryDto;
import com.example.waffleeungaebackend.entity.Category;

import java.util.List;

public interface CategoryMapper {
    Category categoryPostToEntity(CategoryDto.AddCategory requestBody);

    CategoryDto.ResponseCategory categoryEntityToResponse(Category category);

    Category patchCategoryToEntity(CategoryDto.PatchCategory requestBody);

    List<CategoryDto.ResponseCategory> categoryEntityListToResponseList(List<Category> categoryList);
}
