package com.vsquare.audit.service;

import java.util.List;

import com.vsquare.audit.model.Division;

public interface DivisionService {

	public Division createDivision(Division division);
	
	public Division updateDivision(Division division);
	
	public List<Division> findDivisionByState(int stateId);
	
	public void deleteDivision(int divisionId);
}
