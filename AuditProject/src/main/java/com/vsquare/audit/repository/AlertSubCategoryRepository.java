package com.vsquare.audit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vsquare.audit.model.AlertSubCategory;

public interface AlertSubCategoryRepository extends JpaRepository<AlertSubCategory, Long> {

	AlertSubCategory findByAlertSubCategoryName(String name);

}
