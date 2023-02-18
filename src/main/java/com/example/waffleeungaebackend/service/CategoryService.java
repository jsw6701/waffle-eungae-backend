package com.example.waffleeungaebackend.service;

import com.example.waffleeungaebackend.entity.Category;
import com.example.waffleeungaebackend.entity.Post;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface CategoryService {

    Category findById(Long id);

    void addCategoryList(Category category);

    void deleteCategoryList(Long id);

    List<Category> findCategoryList(Sort sort);
}
