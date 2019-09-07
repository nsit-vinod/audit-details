package com.vsquare.audit.service;

import java.util.List;

import com.vsquare.audit.model.AlertSubCategory;

public interface AlertSubCategoryService {

	public AlertSubCategory createAlertSubCategory(AlertSubCategory alertSubCategory);
	
	public AlertSubCategory updateAlertSubCategory(AlertSubCategory alertSubCategory);
	
	public List<AlertSubCategory> getAllAlertSubCategory();
	
	public AlertSubCategory findAlertSubCategoryById(long id);
	
	public AlertSubCategory findAlertSubCategoryByName(String name);
	
}
