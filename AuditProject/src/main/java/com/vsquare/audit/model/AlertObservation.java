package com.vsquare.audit.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.vsquare.audit.admin.model.AuditUser;

@Entity
@Table(name="alert_observation")
public class AlertObservation extends Auditable<AuditUser> {

	@Id
	@Column(name="alert_observation_id")
	private long alertObservationId;
	
	@Column(name="alert_observation_name")
	private String alertObservationName;
	
	@Column(name="is_active")
	private boolean active;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="alert_sub_category_id")
	private AlertSubCategory alertSubCategory;
	
	@Enumerated(EnumType.STRING)
	@Column(name="risk_impact")
	private RiskImpact riskImpact;
	
	
	 @ManyToMany(fetch = FetchType.LAZY,
	            cascade = {
	                CascadeType.PERSIST,
	                CascadeType.MERGE
	            },
	            mappedBy = "alertObservations")
	private Set<AlertCategory> alertCategories;
	
	public long getAlertObservationId() {
		return alertObservationId;
	}

	public void setAlertObservationId(long alertObservationId) {
		this.alertObservationId = alertObservationId;
	}

	public String getAlertObservationName() {
		return alertObservationName;
	}

	public void setAlertObservationName(String alertObservationName) {
		this.alertObservationName = alertObservationName;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public AlertSubCategory getAlertSubCategory() {
		return alertSubCategory;
	}

	public void setAlertSubCategory(AlertSubCategory alertSubCategory) {
		this.alertSubCategory = alertSubCategory;
	}

	public RiskImpact getRiskImpact() {
		return riskImpact;
	}

	public void setRiskImpact(RiskImpact riskImpact) {
		this.riskImpact = riskImpact;
	}

	public Set<AlertCategory> getAlertCategories() {
		return alertCategories;
	}

	public void setAlertCategories(Set<AlertCategory> alertCategories) {
		this.alertCategories = alertCategories;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alertObservationName == null) ? 0 : alertObservationName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlertObservation other = (AlertObservation) obj;
		if (alertObservationName == null) {
			if (other.alertObservationName != null)
				return false;
		} else if (!alertObservationName.equals(other.alertObservationName))
			return false;
		return true;
	}
}
