package com.vsquare.audit.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vsquare.audit.model.AlertCategory;
import com.vsquare.audit.model.AlertObservation;
import com.vsquare.audit.repository.AlertCategoryRepository;
import com.vsquare.audit.repository.AlertObservationRepository;
import com.vsquare.audit.service.AlertCategoryService;

@Service
public class AlertCategoryServiceImpl implements AlertCategoryService {

	@Autowired
	private AlertCategoryRepository alertCategoryRepository;
	@Autowired
	private AlertObservationRepository alertObservationRepository;
	@Override
	public AlertCategory createAlertCategory(AlertCategory alertCategory) {
		
		return alertCategoryRepository.save(alertCategory);
	}

	@Override
	public AlertCategory updateAlertCategory(AlertCategory alertCategory) {
		Optional<AlertCategory> alertCategoryOptional = alertCategoryRepository.findById(alertCategory.getAlertCategoryId());
		if(!alertCategoryOptional.isPresent()) {
			throw new RuntimeException("Alert category is not exit");
		}
		AlertCategory existedAlertCategory = alertCategoryOptional.get();
		existedAlertCategory.setAlertCategoryName(alertCategory.getAlertCategoryName());
		return alertCategoryRepository.save(existedAlertCategory);
	}

	@Override
	public List<AlertCategory> findAllAlertCategories() {
		
		return alertCategoryRepository.findAll();
	}

	@Override
	public AlertCategory mapAlertCategoryWithAlertObservation(AlertCategory alertCategory) {
		Optional<AlertCategory> alertCategoryOptional = alertCategoryRepository.findById(alertCategory.getAlertCategoryId());
		if(!alertCategoryOptional.isPresent()) {
			throw new RuntimeException("Alert category is not exit");
		}
		AlertCategory existedAlertCategory = alertCategoryOptional.get();
		List<Long> observationIds = new ArrayList<>();
		alertCategory.getAlertObservations().forEach(p -> observationIds.add(p.getAlertObservationId()));
		Set<AlertObservation> alertObservations = alertObservationRepository.findByAlertObservationIdIn(observationIds);
		existedAlertCategory.setAlertObservations(alertObservations);
		return alertCategoryRepository.save(existedAlertCategory);
	}

}
