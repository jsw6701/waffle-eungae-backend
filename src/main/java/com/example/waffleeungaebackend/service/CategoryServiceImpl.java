package com.example.waffleeungaebackend.service;

import com.example.waffleeungaebackend.dto.CategoryDto;
import com.example.waffleeungaebackend.dto.request.CategoryCreateRequestDto;
import com.example.waffleeungaebackend.entity.Category;
import com.example.waffleeungaebackend.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService{
    private final CategoryRepository categoryRepository;

    @Override
    public Category findById(Long id) {
        return categoryRepository.findById(id).orElse(new Category());
    }

    @Override
    public void addCategoryList(CategoryCreateRequestDto categoryCreateRequestDto) {
        categoryRepository.save(categoryCreateRequestDto.toEntity());
    }

    @Override
    public void deleteCategoryList(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public List<CategoryDto> findCategoryList(Sort sort) {
        List<Category> categoryList = categoryRepository.findAll(sort);
        return categoryList.stream().map(Category::toDto).collect(Collectors.toList());
    }
}
