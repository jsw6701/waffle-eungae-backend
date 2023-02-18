package com.example.waffleeungaebackend.service;

import com.example.waffleeungaebackend.entity.Category;
import com.example.waffleeungaebackend.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService{
    private final CategoryRepository categoryRepository;

    @Override
    public Category findById(Long id) {
        return categoryRepository.findById(id).orElse(new Category());
    }

    @Override
    public void addCategoryList(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void deleteCategoryList(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public List<Category> findCategoryList(Sort sort) {
        return categoryRepository.findAll(sort);
    }
}
