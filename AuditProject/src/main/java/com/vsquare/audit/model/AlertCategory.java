package com.vsquare.audit.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="alert_category")
public class AlertCategory extends Auditable<String> {

	@Id
	@Column(name="alert_category_id")
	private long alertCategoryId;
	
	@Column(name="alert_category_name")
	private String alertCategoryName;
	
	@Column(name="is_active")
	private boolean active;

	@ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            })
    @JoinTable(name = "alert_category_observation",
            joinColumns = { @JoinColumn(name = "alert_category_id") },
            inverseJoinColumns = { @JoinColumn(name = "alert_observation_id") })
	private Set<AlertObservation> alertObservations;
	
	public long getAlertCategoryId() {
		return alertCategoryId;
	}

	public void setAlertCategoryId(long alertCategoryId) {
		this.alertCategoryId = alertCategoryId;
	}

	public String getAlertCategoryName() {
		return alertCategoryName;
	}

	public void setAlertCategoryName(String alertCategoryName) {
		this.alertCategoryName = alertCategoryName;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}
