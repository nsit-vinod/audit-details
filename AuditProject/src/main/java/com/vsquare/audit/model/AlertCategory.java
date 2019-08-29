package com.vsquare.audit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
