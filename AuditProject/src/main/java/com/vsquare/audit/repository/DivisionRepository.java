package com.vsquare.audit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vsquare.audit.model.Division;
import com.vsquare.audit.model.State;

public interface DivisionRepository extends JpaRepository<Division, Integer> {

	List<Division> findByState(State state);

}
