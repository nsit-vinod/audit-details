package com.vsquare.audit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="alert_observation")
public class AlertObservation extends Auditable<String> {

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
