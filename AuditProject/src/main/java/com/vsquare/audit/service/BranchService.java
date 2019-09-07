package com.vsquare.audit.service;

import java.util.List;

import com.vsquare.audit.model.Branch;

public interface BranchService {

	public Branch createBranch(Branch branch);
	
	public Branch updateBranch(Branch branch);
	
	public List<Branch> findBranchByDivisionId(int divisionId);
	
	public void deleteBranch(int branchId);
}
