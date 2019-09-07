package com.vsquare.audit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vsquare.audit.model.AlertCategory;

public interface AlertCategoryRepository extends JpaRepository<AlertCategory, Long> {

}
