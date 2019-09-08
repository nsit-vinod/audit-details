package com.vsquare.audit.alert.report.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vsquare.audit.alert.report.model.AuditAlertReport;
import com.vsquare.audit.alert.report.repository.AuditAlertReportRepository;
import com.vsquare.audit.alert.report.service.AuditAlertReportService;

@Service
public class AuditAlertReportServiceImpl implements AuditAlertReportService {

	@Autowired
	private AuditAlertReportRepository auditAlertReportRepository;
	@Override
	public AuditAlertReport createAuditAlertReport(AuditAlertReport auditAlertReport) {
		return auditAlertReportRepository.save(auditAlertReport);
	}

	@Override
	public AuditAlertReport updateAuditAlertReport(AuditAlertReport auditAlertReport) {
		Optional<AuditAlertReport> auditAlertReportOptional = auditAlertReportRepository.findById(auditAlertReport.getAuditAlertReportId());
		if(!auditAlertReportOptional.isPresent()) {
			throw new RuntimeException("Audit alert report does not exist.");
		}
		AuditAlertReport alertReport = auditAlertReportOptional.get();
		alertReport.copy(auditAlertReport);
		return auditAlertReportRepository.save(alertReport);
	}

	@Override
	public List<AuditAlertReport> findAuditAlertReportByStateCode(String stateCode) {
		
		return auditAlertReportRepository.findByStateCode(stateCode);
	}

	@Override
	public List<AuditAlertReport> findAuditAlertReportByDivisionCode(String divisionCode) {
		return auditAlertReportRepository.findByDivisionCode(divisionCode);
	}

	@Override
	public List<AuditAlertReport> findAuditAlertReportByBranchCode(String branchCode) {
		return auditAlertReportRepository.findByBranchCode(branchCode);
	}

	@Override
	public List<AuditAlertReport> findAuditAlertReportByCentreCode(String centreCode) {
		return auditAlertReportRepository.findByCentreCode(centreCode);
	}

	@Override
	public void deleteAuditAlertReport(long id) {
		auditAlertReportRepository.deleteById(id);
		
	}

}
