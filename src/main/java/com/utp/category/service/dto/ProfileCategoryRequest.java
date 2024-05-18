package com.utp.category.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfileCategoryRequest {
    private Long categoryProfileId;
    private Long userProfileId;
    private Long detailCategoryId;
    private String level;
    private Integer yearsExperience;
    private String references;
}
