package com.vsquare.audit.service;

import java.util.List;

import com.vsquare.audit.model.AlertObservation;

public interface AlertObservationService {

	public AlertObservation createAlertObservation(AlertObservation alertObservation);
	
	public AlertObservation updateAlertObservation(AlertObservation alertObservation);
	
	public List<AlertObservation> findAllAlertObservation();
	
	public void mapAlertSubCategoryWithAlertObservation(AlertObservation alertObservation);
}
