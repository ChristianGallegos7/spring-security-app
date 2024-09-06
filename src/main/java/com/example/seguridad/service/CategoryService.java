package com.example.seguridad.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.seguridad.dto.SaveCategory;
import com.example.seguridad.persistence.entity.Category;

import jakarta.validation.Valid;

public interface CategoryService {

    Page<Category> findAll(Pageable pageable);

    Optional<Category> findOneById(Long productId);

    Category createOne(@Valid SaveCategory saveCategory);

    Category updateOneById(Long categoryId, @Valid SaveCategory saveCategory);

    Category disabledOneById(Long categoryId);

}
