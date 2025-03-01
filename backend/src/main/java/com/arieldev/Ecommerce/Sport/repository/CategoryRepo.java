package com.arieldev.Ecommerce.Sport.repository;

import com.arieldev.Ecommerce.Sport.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
