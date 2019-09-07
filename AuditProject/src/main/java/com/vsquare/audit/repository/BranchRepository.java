package com.vsquare.audit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vsquare.audit.model.Branch;
import com.vsquare.audit.model.Division;

public interface BranchRepository extends JpaRepository<Branch, Integer> {

	List<Branch> findByDivision(Division division);

}
