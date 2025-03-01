package com.arieldev.Ecommerce.Sport.service.interf;


import com.arieldev.Ecommerce.Sport.dto.CategoryDto;
import com.arieldev.Ecommerce.Sport.dto.Response;

public interface CategoryService {

    Response createCategory(CategoryDto categoryRequest);
    Response updateCategory(Long categoryId, CategoryDto categoryRequest);
    Response getAllCategories();
    Response getCategoryById(Long categoryId);
    Response deleteCategory(Long categoryId);
}
