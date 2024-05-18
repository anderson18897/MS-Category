package com.utp.category.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ProfileCategoryDto {
    private Long categoryProfileId;
    private Long userProfileId;
    private Long detailCategoryId;
    private String level;
    private Integer yearsExperience;
    private String references;
}
