package com.vsquare.audit.service;

import java.util.List;

import com.vsquare.audit.model.Centre;

public interface CentreService {

	public Centre createCentre(Centre centre);
	
	public Centre updateCentre(Centre centre);
	
	public List<Centre> findCentreByBranch(int branchId);
	
	public void deleteCentre(int centreId);
}
