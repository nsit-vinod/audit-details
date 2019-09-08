package com.vsquare.audit.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vsquare.audit.model.AlertSubCategory;
import com.vsquare.audit.service.AlertSubCategoryService;

@RestController
public class AlertSubCategoryController {

	@Autowired
	private AlertSubCategoryService alertSubCategoryService;
	
	@PostMapping(path=" /alert-sub-category")
	public AlertSubCategory createAlertSubCategory(@RequestBody AlertSubCategory alertSubCategory) {
		return alertSubCategoryService.createAlertSubCategory(alertSubCategory);
	}

	@PutMapping(path=" /alert-sub-category")
	public AlertSubCategory updateAlertSubCategory(@RequestBody AlertSubCategory alertSubCategory) {
		return alertSubCategoryService.updateAlertSubCategory(alertSubCategory);
	}

	@GetMapping(path=" /alert-sub-category")
	public List<AlertSubCategory> getAllAlertSubCategory() {
		return alertSubCategoryService.getAllAlertSubCategory();
	}

	@GetMapping(path=" /alert-sub-category/{alertSubCategoryId}")
	public AlertSubCategory findAlertSubCategoryById(@PathVariable("alertSubCategoryId") long alertSubCategoryId) {
		return alertSubCategoryService.findAlertSubCategoryById(alertSubCategoryId);
	}

	@GetMapping(path=" /alert-sub-category", params = {"alertSubCategoryName"})
	public AlertSubCategory findAlertSubCategoryByName(@RequestParam("alertSubCategoryName") String alertSubCategoryName) {
		return alertSubCategoryService.findAlertSubCategoryByName(alertSubCategoryName);
	}

}
