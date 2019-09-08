package com.vsquare.audit.alert.report.service;

import java.util.List;

import com.vsquare.audit.alert.report.model.AuditAlertReport;

public interface AuditAlertReportService {

	public AuditAlertReport createAuditAlertReport(AuditAlertReport auditAlertReport);
	
	public AuditAlertReport updateAuditAlertReport(AuditAlertReport auditAlertReport);
	
	public List<AuditAlertReport> findAuditAlertReportByStateCode(String stateCode);
	
	public List<AuditAlertReport> findAuditAlertReportByDivisionCode(String divisionCode);
	
	public List<AuditAlertReport> findAuditAlertReportByBranchCode(String branchCode);
	
	public List<AuditAlertReport> findAuditAlertReportByCentreCode(String centreCode);
	
	public void deleteAuditAlertReport(long id);
	
}
