package com.example.seguridad.persistence.repository;

import com.example.seguridad.persistence.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
