package com.utp.category.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CategoryDto {
    private Long categoryId;
    private String description;
    private Boolean state;
}
