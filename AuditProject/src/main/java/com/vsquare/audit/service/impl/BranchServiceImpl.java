package com.vsquare.audit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vsquare.audit.model.Branch;
import com.vsquare.audit.model.Division;
import com.vsquare.audit.repository.BranchRepository;
import com.vsquare.audit.repository.DivisionRepository;
import com.vsquare.audit.service.BranchService;

@Service
public class BranchServiceImpl implements BranchService {

	@Autowired
	private BranchRepository branchRepository;
	
	@Autowired
	private DivisionRepository divisionRepository;
	@Override
	public Branch createBranch(Branch branch) {
		return branchRepository.save(branch);
	}

	@Override
	public Branch updateBranch(Branch branch) {
		return branchRepository.save(branch);
	}

	@Override
	public List<Branch> findBranchByDivisionId(int divisionId) {
		Division division = new Division();
		division.setDivisionId(divisionId);
		return branchRepository.findByDivision(division);
	}

	@Override
	public void deleteBranch(int branchId) {
		branchRepository.deleteById(branchId);
	}

}
