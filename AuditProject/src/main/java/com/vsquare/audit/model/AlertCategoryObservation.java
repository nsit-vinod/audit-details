package com.vsquare.audit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name= "alert_category_observation",uniqueConstraints = {@UniqueConstraint(columnNames= {"alert_category_id","alert_observation_id"})})
public class AlertCategoryObservation {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	
	@ManyToOne
	@JoinColumn(name="alert_category_id")
	private AlertCategory alertCategory;
	
	@ManyToOne
	@JoinColumn(name="alert_observation_id")
	private AlertObservation alertObservation;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AlertCategory getAlertCategory() {
		return alertCategory;
	}

	public void setAlertCategory(AlertCategory alertCategory) {
		this.alertCategory = alertCategory;
	}

	public AlertObservation getAlertObservation() {
		return alertObservation;
	}

	public void setAlertObservation(AlertObservation alertObservation) {
		this.alertObservation = alertObservation;
	}
	
	
}
