package com.vsquare.audit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vsquare.audit.model.Branch;
import com.vsquare.audit.model.Centre;
import com.vsquare.audit.repository.CentreRepository;
import com.vsquare.audit.service.CentreService;

@Service
public class CentreServiceImpl implements CentreService {

	@Autowired
	private CentreRepository centreRepository;
	@Override
	public Centre createCentre(Centre centre) {
		// TODO Auto-generated method stub
		return centreRepository.save(centre);
	}

	@Override
	public Centre updateCentre(Centre centre) {
		// TODO Auto-generated method stub
		return centreRepository.save(centre);
	}

	@Override
	public List<Centre> findCentreByBranch(int branchId) {
		Branch branch = new Branch();
		branch.setBranchId(branchId);
		return centreRepository.findByBranch(branch);
	}

	@Override
	public void deleteCentre(int centreId) {
		// TODO Auto-generated method stub

	}

}
