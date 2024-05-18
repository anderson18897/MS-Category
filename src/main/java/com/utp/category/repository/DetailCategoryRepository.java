package com.utp.category.repository;

import com.utp.category.repository.model.DetailCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailCategoryRepository extends JpaRepository<DetailCategoryEntity, Long> {
}
