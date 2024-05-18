package com.utp.category.repository.model;

import com.utp.category.repository.base.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;

@Data
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "perfil_categoria")
public class ProfileCategoryEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -3224272046158834811L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_profile_id")
    private Long categoryProfileId;

    @Column(name = "user_profile_id")
    private Long userProfileId;

    @Column(name = "detail_category_id")
    private Long detailCategoryId;

    @Column(name = "level")
    private String level;

    @Column(name = "years_experience")
    private Integer yearsExperience;

    @Column(name = "references")
    private String references;
}
