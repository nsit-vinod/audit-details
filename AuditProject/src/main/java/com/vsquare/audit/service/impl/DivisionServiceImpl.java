package com.vsquare.audit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vsquare.audit.model.Division;
import com.vsquare.audit.model.State;
import com.vsquare.audit.repository.DivisionRepository;
import com.vsquare.audit.service.DivisionService;

@Service
public class DivisionServiceImpl implements DivisionService {

	@Autowired
	private DivisionRepository divisionRepository;
	@Override
	public Division createDivision(Division division) {
		return divisionRepository.save(division);
	}

	@Override
	public Division updateDivision(Division division) {
		return divisionRepository.save(division);
	}

	@Override
	public List<Division> findDivisionByState(int stateId) {
		State state = new State();
		state.setStateId(stateId);
		return divisionRepository.findByState(state);
	}

	@Override
	public void deleteDivision(int divisionId) {
		divisionRepository.deleteById(divisionId);
	}

}
