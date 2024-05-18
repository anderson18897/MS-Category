package com.utp.category.service;

import com.utp.category.dto.CategoryDto;
import java.util.List;
import java.util.UUID;

public interface CategoryService {
    void createCategory(CategoryDto categoryDto);
    void updateCategory(UUID id, CategoryDto categoryDto);
    List<CategoryDto> getAllCategories();
    CategoryDto getCategoryById(UUID id);
    void deleteCategory(UUID id);
}
