package com.vsquare.audit.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vsquare.audit.model.AlertObservation;
import com.vsquare.audit.service.AlertObservationService;

@RestController
public class AlertObservationController  {

	@Autowired
	private AlertObservationService alertObservationService;
	
	@PostMapping(path="/alert-observation")
	public AlertObservation createAlertObservation(@RequestBody AlertObservation alertObservation) {
		return alertObservationService.createAlertObservation(alertObservation);
	}

	@PutMapping(path="/alert-observation")
	public AlertObservation updateAlertObservation(@RequestBody AlertObservation alertObservation) {
		return alertObservationService.updateAlertObservation(alertObservation);
	}

	@GetMapping(path="/alert-observation")
	public List<AlertObservation> findAllAlertObservation() {
		return alertObservationService.findAllAlertObservation();
	}

	@PutMapping(path="/alert-observation/alert-sub-category/map")
	public void mapAlertSubCategoryWithAlertObservation(@RequestBody AlertObservation alertObservation) {
		alertObservationService.mapAlertSubCategoryWithAlertObservation(alertObservation);

	}

}
