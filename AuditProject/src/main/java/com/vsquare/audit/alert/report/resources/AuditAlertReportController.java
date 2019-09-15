package com.vsquare.audit.alert.report.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vsquare.audit.alert.report.model.AuditAlertReport;
import com.vsquare.audit.alert.report.service.AuditAlertReportService;

@RestController
@RequestMapping("/audit-alert-report")
public class AuditAlertReportController {

	@Autowired
	private AuditAlertReportService auditAlertReportService;
	
	@PostMapping
	public AuditAlertReport createAuditAlertReport(@RequestBody AuditAlertReport auditAlertReport) {
		return auditAlertReportService.createAuditAlertReport(auditAlertReport);
	}

	@PutMapping
	public AuditAlertReport updateAuditAlertReport(@RequestBody AuditAlertReport auditAlertReport) {
		return auditAlertReportService.updateAuditAlertReport(auditAlertReport);
	}

	@GetMapping(params= {"stateCode"})
	public List<AuditAlertReport> findAuditAlertReportByStateCode(@RequestParam("stateCode") String stateCode) {
		return auditAlertReportService.findAuditAlertReportByStateCode(stateCode);
	}

	@GetMapping(params= {"divisionCode"})
	public List<AuditAlertReport> findAuditAlertReportByDivisionCode(@RequestParam("divisionCode")String divisionCode) {
		return auditAlertReportService.findAuditAlertReportByDivisionCode(divisionCode);
	}

	@GetMapping(params= {"branchCode"})
	public List<AuditAlertReport> findAuditAlertReportByBranchCode(@RequestParam("branchCode") String branchCode) {
		return auditAlertReportService.findAuditAlertReportByBranchCode(branchCode);
	}

	@GetMapping(params= {"centreCode"})
	public List<AuditAlertReport> findAuditAlertReportByCentreCode(@RequestParam("centreCode")String centreCode) {
		return auditAlertReportService.findAuditAlertReportByCentreCode(centreCode);
	}

	@DeleteMapping(path="/{id}")
	public void deleteAuditAlertReport(@PathVariable("id") long id) {
		auditAlertReportService.deleteAuditAlertReport(id);
	}

}
