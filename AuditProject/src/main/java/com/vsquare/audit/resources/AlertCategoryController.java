package com.vsquare.audit.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vsquare.audit.model.AlertCategory;
import com.vsquare.audit.service.AlertCategoryService;

@RestController
public class AlertCategoryController {

	@Autowired
	private AlertCategoryService alertCategoryService;
	
	@PostMapping(path = "alert-category")
	public AlertCategory createAlertCategory(@RequestBody AlertCategory alertCategory) {
		return alertCategoryService.createAlertCategory(alertCategory);
	}
	

	@PutMapping(path = "alert-category")
	public AlertCategory updateAlertCategory(@RequestBody AlertCategory alertCategory) {
		return alertCategoryService.updateAlertCategory(alertCategory);
	}

	@GetMapping(path = "alert-category")
	public List<AlertCategory> findAllAlertCategories() {
		return alertCategoryService.findAllAlertCategories();
	}
	

	@PutMapping(path = "alert-category/alert-observation/map")
	public AlertCategory mapAlertCategoryWithAlertObservation(@RequestBody AlertCategory alertCategory) {
		return alertCategoryService.mapAlertCategoryWithAlertObservation(alertCategory);
	}

}
