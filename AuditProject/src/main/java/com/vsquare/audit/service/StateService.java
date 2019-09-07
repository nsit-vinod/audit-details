package com.vsquare.audit.service;

import java.util.List;

import com.vsquare.audit.model.State;

public interface StateService {

	public State createState(State state);
	
	public State updateState(State state);
	
	public List<State> findAllStates();
	
	public void deleteState(int id);
	
}
 