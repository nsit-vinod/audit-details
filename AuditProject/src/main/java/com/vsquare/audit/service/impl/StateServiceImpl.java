package com.vsquare.audit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vsquare.audit.model.State;
import com.vsquare.audit.repository.StateRepository;
import com.vsquare.audit.service.StateService;

@Service
public class StateServiceImpl implements StateService {

	@Autowired
	private StateRepository stateRepository;
	@Override
	public State createState(State state) {
		return stateRepository.save(state);
	}

	@Override
	public State updateState(State state) {
		return stateRepository.save(state);
	}

	@Override
	public List<State> findAllStates() {
		return stateRepository.findAll();
	}

	@Override
	public void deleteState(int id) {
		stateRepository.deleteById(id);
	}

}
