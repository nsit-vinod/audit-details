package com.vsquare.audit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vsquare.audit.model.Branch;
import com.vsquare.audit.model.Centre;

public interface CentreRepository extends JpaRepository<Centre, Integer> {

	List<Centre> findByBranch(Branch branch);

}
