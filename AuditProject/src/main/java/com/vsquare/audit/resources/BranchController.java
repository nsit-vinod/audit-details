package com.vsquare.audit.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vsquare.audit.model.Branch;
import com.vsquare.audit.service.BranchService;

@RestController
public class BranchController {

	@Autowired
	private BranchService branchService;
	
	@PostMapping(path = "/branch")
	public Branch createBranch(@RequestBody Branch branch) {
		return branchService.createBranch(branch);
	}

	@PutMapping(path = "/branch")
	public Branch updateBranch(@RequestBody Branch branch) {
		return branchService.updateBranch(branch);
	}

	@GetMapping(path = "/branch", params = {"divisionId"} )
	public List<Branch> findBranchByDivisionId(@RequestParam("divisionId") int divisionId) {
		return branchService.findBranchByDivisionId(divisionId);
	}

	@DeleteMapping(path = "/branch/{branchId}")
	public void deleteBranch(@PathVariable("branchId") int branchId) {
		branchService.deleteBranch(branchId);

	}

}
