package com.utp.category.service;

import com.utp.category.dto.CategoryDto;
import java.util.List;
import java.util.UUID;

public interface CategoryService {
    CategoryDto createCategory(CategoryDto categoryDto);
    CategoryDto updateCategory(UUID id, CategoryDto categoryDto);
    List<CategoryDto> getAllCategories();
    CategoryDto getCategoryById(UUID id);
    void deleteCategory(UUID id);
}
