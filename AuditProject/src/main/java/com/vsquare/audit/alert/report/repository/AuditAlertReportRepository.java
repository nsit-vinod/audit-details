package com.vsquare.audit.alert.report.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vsquare.audit.alert.report.model.AuditAlertReport;

public interface AuditAlertReportRepository extends JpaRepository<AuditAlertReport, Long> {

	List<AuditAlertReport> findByStateCode(String stateCode);

	List<AuditAlertReport> findByDivisionCode(String divisionCode);

	List<AuditAlertReport> findByBranchCode(String branchCode);

	List<AuditAlertReport> findByCentreCode(String centreCode);

}
