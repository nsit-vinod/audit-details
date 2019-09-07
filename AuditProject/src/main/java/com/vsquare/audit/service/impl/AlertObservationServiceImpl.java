package com.vsquare.audit.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vsquare.audit.model.AlertObservation;
import com.vsquare.audit.model.AlertSubCategory;
import com.vsquare.audit.repository.AlertObservationRepository;
import com.vsquare.audit.repository.AlertSubCategoryRepository;
import com.vsquare.audit.service.AlertObservationService;

@Service
public class AlertObservationServiceImpl implements AlertObservationService {

	@Autowired
	private AlertObservationRepository alertObservationRepository;
	
	@Autowired
	private AlertSubCategoryRepository alertSubCategoryRepository;
	@Override
	public AlertObservation createAlertObservation(AlertObservation alertObservation) {
		return alertObservationRepository.save(alertObservation);
	}

	@Override
	public AlertObservation updateAlertObservation(AlertObservation alertObservation) {
		Optional<AlertObservation> alertObservationOptional = alertObservationRepository.findById(alertObservation.getAlertObservationId());
		if(!alertObservationOptional.isPresent()) {
			throw new RuntimeException("Alert observation does not exist.");
		}
		AlertObservation existedAlertObservation = alertObservationOptional.get();
		existedAlertObservation.setAlertObservationName(alertObservation.getAlertObservationName());
		existedAlertObservation.setAlertSubCategory(alertObservation.getAlertSubCategory());
		return alertObservationRepository.save(existedAlertObservation);
	}

	@Override
	public List<AlertObservation> findAllAlertObservation() {
		return alertObservationRepository.findAll();
	}

	@Override
	public void mapAlertSubCategoryWithAlertObservation(AlertObservation alertObservation) {
		Optional<AlertObservation> alertObservationOptional = alertObservationRepository.findById(alertObservation.getAlertObservationId());
		if(!alertObservationOptional.isPresent()) {
			throw new RuntimeException("Alert observation does not exist.");
		}
		AlertObservation existedAlertObservation = alertObservationOptional.get();
		AlertSubCategory alertSubCategory = alertSubCategoryRepository.findById(alertObservation.getAlertSubCategory().getAlertSubCategoryId()).get();
		existedAlertObservation.setAlertSubCategory(alertSubCategory);
		alertObservationRepository.save(existedAlertObservation);
		
	}

}
