package com.example.seguridad.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.seguridad.dto.SaveProduct;
import com.example.seguridad.persistence.entity.Product;

import jakarta.validation.Valid;

public interface ProductService {

    Page<Product> findAll(Pageable pageable);

    Optional<Product> findOneById(Long productId);

    Product createOne(@Valid SaveProduct saveProduct);

    Product updateOneById(Long productId, @Valid SaveProduct saveProduct);

    Product disabledOneById(Long productId);

}
