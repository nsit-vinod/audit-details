package com.vsquare.audit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vsquare.audit.model.State;

public interface StateRepository extends JpaRepository<State, Integer> {

}
