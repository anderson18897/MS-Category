package com.utp.category.mapper;

import com.utp.category.dto.CategoryDto;
import com.utp.category.repository.model.CategoryEntity;

public class CategoryMapper {
    public static CategoryDto toDto(CategoryEntity entity) {
        return CategoryDto.builder()
                .id(entity.getId())
                .description(entity.getDescription())
                .build();
    }

    public static CategoryEntity toEntity(CategoryDto dto) {
        return CategoryEntity.builder()
                .id(dto.getId())
                .description(dto.getDescription())
                .build();
    }
}

