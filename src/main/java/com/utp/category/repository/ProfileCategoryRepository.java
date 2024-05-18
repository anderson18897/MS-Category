package com.utp.category.repository;

import com.utp.category.repository.model.ProfileCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileCategoryRepository extends JpaRepository<ProfileCategoryEntity, Long> {
}
