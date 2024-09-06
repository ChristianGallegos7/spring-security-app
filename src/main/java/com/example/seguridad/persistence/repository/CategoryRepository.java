package com.example.seguridad.persistence.repository;

import com.example.seguridad.persistence.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
