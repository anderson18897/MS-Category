package com.utp.category.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DetailCategoryDto {
    private Long detailCategoryId;
    private CategoryDto category;
    private String description;
}
