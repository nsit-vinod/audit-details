package com.vsquare.audit.service;

import java.util.List;

import com.vsquare.audit.model.AlertCategory;

public interface AlertCategoryService {

	public AlertCategory createAlertCategory(AlertCategory alertCategory);
	
	public AlertCategory updateAlertCategory(AlertCategory alertCategory);
	
	public List<AlertCategory> findAllAlertCategories();
	
	public AlertCategory mapAlertCategoryWithAlertObservation(AlertCategory alertCategory);
	
}
