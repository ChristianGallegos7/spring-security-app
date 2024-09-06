package com.example.seguridad.controller;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.seguridad.dto.SaveCategory;
import com.example.seguridad.dto.SaveProduct;
import com.example.seguridad.persistence.entity.Category;
import com.example.seguridad.persistence.entity.Product;
import com.example.seguridad.service.CategoryService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<Page<Category>> findAll(Pageable pageable) {
        Page<Category> categoriesPage = categoryService.findAll(pageable);

        if (categoriesPage.hasContent()) {
            return ResponseEntity.ok(categoriesPage);
        }

        return ResponseEntity.notFound().build();

    }

    @GetMapping("/{categoryId}")
    public ResponseEntity<Category> findOneById(@PathVariable Long categoryId) {

        Optional<Category> category = categoryService.findOneById(categoryId);

        if (category.isPresent()) {
            return ResponseEntity.ok(category.get());
        }

        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Category> createOne(@RequestBody @Valid SaveCategory saveCategory) {

        Category category = categoryService.createOne(saveCategory);

        return ResponseEntity.status(HttpStatus.CREATED).body(category);
    }

    @PutMapping("/{categoryId}")
    public ResponseEntity<Category> updateOneById(
            @PathVariable Long categoryId,
            @RequestBody @Valid SaveCategory saveProduct) {

        Category category = categoryService.updateOneById(categoryId, saveProduct);

        return ResponseEntity.ok(category);
    }

    @PutMapping("/{categoryId}/disabled")
    public ResponseEntity<Category> disabledOneById(@PathVariable Long categoryId) {
        Category category = categoryService.disabledOneById(categoryId);

        return ResponseEntity.ok(category);
    }
}
