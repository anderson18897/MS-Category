package com.utp.category.service.impl;

import com.utp.category.dto.CategoryDto;
import com.utp.category.mapper.CategoryMapper;
import com.utp.category.repository.CategoryRepository;
import com.utp.category.repository.model.CategoryEntity;
import com.utp.category.service.CategoryService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    @Transactional
    public void createCategory(CategoryDto categoryDto) {
        CategoryEntity entity = CategoryMapper.toEntity(categoryDto);
        categoryRepository.save(entity);
    }

    @Override
    @Transactional
    public void updateCategory(UUID id, CategoryDto categoryDto) {
        categoryRepository.findById(id)
                .map(existingEntity -> {
                    existingEntity.setDescription(categoryDto.getDescription());
                    return categoryRepository.save(existingEntity);
                }).orElseThrow(() -> new RuntimeException("Category not found"));
    }

    @Override
    public List<CategoryDto> getAllCategories() {
        return categoryRepository.findAll().stream()
                .map(CategoryMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public CategoryDto getCategoryById(UUID id) {
        return categoryRepository.findById(id)
                .map(CategoryMapper::toDto)
                .orElseThrow(() -> new RuntimeException("Category not found"));
    }

    @Override
    @Transactional
    public void deleteCategory(UUID id) {
        categoryRepository.deleteById(id);
    }
}
