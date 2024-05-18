package com.utp.category.service.dto;

import com.utp.category.dto.CategoryDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailCategoryRequest {
    private Long detailCategoryId;
    private CategoryDto category;
    private String description;
}
