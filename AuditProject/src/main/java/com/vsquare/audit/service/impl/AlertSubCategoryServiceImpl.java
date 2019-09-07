package com.vsquare.audit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vsquare.audit.model.AlertSubCategory;
import com.vsquare.audit.repository.AlertSubCategoryRepository;
import com.vsquare.audit.service.AlertSubCategoryService;

@Service
public class AlertSubCategoryServiceImpl implements AlertSubCategoryService {

	@Autowired
	private AlertSubCategoryRepository alertSubCategoryRepository;
	@Override
	public AlertSubCategory createAlertSubCategory(AlertSubCategory alertSubCategory) {
		return alertSubCategoryRepository.save(alertSubCategory);
	}

	@Override
	public AlertSubCategory updateAlertSubCategory(AlertSubCategory alertSubCategory) {
		return alertSubCategoryRepository.save(alertSubCategory);
	}

	@Override
	public List<AlertSubCategory> getAllAlertSubCategory() {
		return alertSubCategoryRepository.findAll();
	}

	@Override
	public AlertSubCategory findAlertSubCategoryById(long id) {
		return alertSubCategoryRepository.findById(id).get();
	}

	@Override
	public AlertSubCategory findAlertSubCategoryByName(String name) {
		return alertSubCategoryRepository.findByAlertSubCategoryName(name);
	}

}
