package com.example.waffleeungaebackend.controller;

import com.example.waffleeungaebackend.dto.CategoryDto;
import com.example.waffleeungaebackend.dto.request.CategoryCreateRequestDto;
import com.example.waffleeungaebackend.dto.request.CategoryPatchRequestDto;
import com.example.waffleeungaebackend.entity.Category;
import com.example.waffleeungaebackend.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@AllArgsConstructor
@RestController
@RequestMapping("/")
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping
    public ResponseEntity<CategoryDto> create(@RequestBody CategoryCreateRequestDto createRequestDto){
        System.out.println("create");

        Category result = this.categoryService.addCategory(createRequestDto);
        return ResponseEntity.ok(new CategoryDto(result));
    }

    @GetMapping
    public ResponseEntity<List<CategoryDto>> readAll(){
        System.out.println("read all");
        List<CategoryDto> categoryList = this.categoryService.findAllCategory();
        return ResponseEntity.ok(categoryList);
    }

    @PatchMapping("{id}")
    public ResponseEntity<CategoryDto> update(@PathVariable Long id, @RequestBody CategoryPatchRequestDto patchRequestDto){
        System.out.println("update");

        Category result = categoryService.updateById(id, patchRequestDto);
        return ResponseEntity.ok(new CategoryDto(result));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        System.out.println("delete");

        this.categoryService.deleteCategory(id);
        return ResponseEntity.ok().build();
    }
}
