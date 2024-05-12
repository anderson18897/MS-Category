package com.utp.category.dto;

import lombok.Builder;
import lombok.Data;
import java.util.UUID;

@Builder
@Data
public class CategoryDto {
    private UUID id;
    private String description;
    private Boolean state;
}
