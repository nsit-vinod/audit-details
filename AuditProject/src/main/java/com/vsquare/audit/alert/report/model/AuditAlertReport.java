package com.vsquare.audit.alert.report.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.vsquare.audit.admin.model.AuditUser;
import com.vsquare.audit.model.Auditable;

@Entity
@Table(name = "audit_alert_report")
public class AuditAlertReport extends Auditable<AuditUser> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="audit_alert_report_id")
	private long auditAlertReportId;
	
	@Column(name="state_name")
	private String stateName;

	@Column(name="state_code")
	private String stateCode;

	@Column(name="division_name")
	private String divisionName;

	@Column(name="division_code")
	private String divisionCode;

	@Column(name="branch_name")
	private String branchName;

	@Column(name="branch_code")
	private String branchCode;

	@Column(name="centre_name")
	private String centreName;

	@Column(name="centre_code")
	private String centreCode;

	@Column(name="number_of_centres")
	private int numberOfCentres;

	@Column(name="audit_manager_emp_code")
	private String auditManagerEmpCode;

	@Column(name="audit_manager_name")
	private String auditManagerName;

	@Column(name="alert_raised_date")
	private Date alertRaisedDate;

	@Column(name="alert_category")
	private String alertCategory;

	@Column(name="alert_sub_category")
	private String alertSubCategory;

	@Column(name="alert_observation")
	private String alertObservation;

	@Column(name="audit_type")
	private String auditType;

	@Column(name="risk_impact")
	private String riskImpact;

	@Column(name="comments_of_audit_manager")
	private String commentsOfAuditManager;

	@Column(name="amount_involved")
	private double amountInvolved;

	@Column(name="mail_sent_to_ops")
	private Date mailSentToOps;

	@Column(name="mail_reply_from_ops")
	private Date mailReplyFromOps;

	@Column(name="tat")
	private String tat;

	@Column(name="compliance_of_operation")
	private String complianceOfOperations;

	@Column(name="operation_alert_status")
	private String OperationAlertStatus;

	
	public AuditAlertReport() {
	}

	public void copy(AuditAlertReport alertReport) {
		this.stateName = alertReport.getStateName();
		this.stateCode = alertReport.getStateCode();
		this.divisionName = alertReport.getDivisionName();
		this.divisionCode = alertReport.getDivisionCode();
		this.branchName = alertReport.getBranchName();
		this.branchCode = alertReport.getBranchCode();
		this.centreName = alertReport.getCentreName();
		this.centreCode = alertReport.getCentreCode();
		this.numberOfCentres = alertReport.getNumberOfCentres();
		this.auditManagerEmpCode = alertReport.getAuditManagerEmpCode();
		this.auditManagerName = alertReport.getAuditManagerName();
		this.alertRaisedDate = alertReport.getAlertRaisedDate();
		this.alertCategory = alertReport.getAlertCategory();
		this.alertSubCategory = alertReport.getAlertSubCategory();
		this.alertObservation = alertReport.getAlertObservation();
		this.auditType = alertReport.getAuditType();
		this.riskImpact = alertReport.getRiskImpact();
		this.commentsOfAuditManager = alertReport.getCommentsOfAuditManager();
		this.amountInvolved = alertReport.getAmountInvolved();
		this.mailSentToOps = alertReport.getMailSentToOps();
		this.mailReplyFromOps = alertReport.getMailReplyFromOps();
		this.tat = alertReport.getTat();
		this.complianceOfOperations = alertReport.getComplianceOfOperations();
		this.OperationAlertStatus = alertReport.getOperationAlertStatus();
	}

	public long getAuditAlertReportId() {
		return auditAlertReportId;
	}

	public void setAuditAlertReportId(long auditAlertReportId) {
		this.auditAlertReportId = auditAlertReportId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getDivisionName() {
		return divisionName;
	}

	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}

	public String getDivisionCode() {
		return divisionCode;
	}

	public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getCentreName() {
		return centreName;
	}

	public void setCentreName(String centreName) {
		this.centreName = centreName;
	}

	public String getCentreCode() {
		return centreCode;
	}

	public void setCentreCode(String centreCode) {
		this.centreCode = centreCode;
	}

	public int getNumberOfCentres() {
		return numberOfCentres;
	}

	public void setNumberOfCentres(int numberOfCentres) {
		this.numberOfCentres = numberOfCentres;
	}

	public String getAuditManagerEmpCode() {
		return auditManagerEmpCode;
	}

	public void setAuditManagerEmpCode(String auditManagerEmpCode) {
		this.auditManagerEmpCode = auditManagerEmpCode;
	}

	public String getAuditManagerName() {
		return auditManagerName;
	}

	public void setAuditManagerName(String auditManagerName) {
		this.auditManagerName = auditManagerName;
	}

	public Date getAlertRaisedDate() {
		return alertRaisedDate;
	}

	public void setAlertRaisedDate(Date alertRaisedDate) {
		this.alertRaisedDate = alertRaisedDate;
	}

	public String getAlertCategory() {
		return alertCategory;
	}

	public void setAlertCategory(String alertCategory) {
		this.alertCategory = alertCategory;
	}

	public String getAlertSubCategory() {
		return alertSubCategory;
	}

	public void setAlertSubCategory(String alertSubCategory) {
		this.alertSubCategory = alertSubCategory;
	}

	public String getAlertObservation() {
		return alertObservation;
	}

	public void setAlertObservation(String alertObservation) {
		this.alertObservation = alertObservation;
	}

	public String getAuditType() {
		return auditType;
	}

	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

	public String getRiskImpact() {
		return riskImpact;
	}

	public void setRiskImpact(String riskImpact) {
		this.riskImpact = riskImpact;
	}

	public String getCommentsOfAuditManager() {
		return commentsOfAuditManager;
	}

	public void setCommentsOfAuditManager(String commentsOfAuditManager) {
		this.commentsOfAuditManager = commentsOfAuditManager;
	}

	public double getAmountInvolved() {
		return amountInvolved;
	}

	public void setAmountInvolved(double amountInvolved) {
		this.amountInvolved = amountInvolved;
	}

	public Date getMailSentToOps() {
		return mailSentToOps;
	}

	public void setMailSentToOps(Date mailSentToOps) {
		this.mailSentToOps = mailSentToOps;
	}

	public Date getMailReplyFromOps() {
		return mailReplyFromOps;
	}

	public void setMailReplyFromOps(Date mailReplyFromOps) {
		this.mailReplyFromOps = mailReplyFromOps;
	}

	public String getTat() {
		return tat;
	}

	public void setTat(String tat) {
		this.tat = tat;
	}

	public String getComplianceOfOperations() {
		return complianceOfOperations;
	}

	public void setComplianceOfOperations(String complianceOfOperations) {
		this.complianceOfOperations = complianceOfOperations;
	}

	public String getOperationAlertStatus() {
		return OperationAlertStatus;
	}

	public void setOperationAlertStatus(String operationAlertStatus) {
		OperationAlertStatus = operationAlertStatus;
	}

}
