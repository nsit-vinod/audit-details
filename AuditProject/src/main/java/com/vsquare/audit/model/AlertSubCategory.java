package com.vsquare.audit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="alert_sub_category")
public class AlertSubCategory extends Auditable<String> {

	@Id
	@Column(name="alert_sub_category_id")
	private long alertSubCategoryId;
	
	@Column(name="alert_sub_category_name")
	private String alertSubCategoryName;
	
	@Column(name="is_active")
	private boolean active;

	public long getAlertSubCategoryId() {
		return alertSubCategoryId;
	}

	public void setAlertSubCategoryId(long alertSubCategoryId) {
		this.alertSubCategoryId = alertSubCategoryId;
	}

	public String getAlertSubCategoryName() {
		return alertSubCategoryName;
	}

	public void setAlertSubCategoryName(String alertSubCategoryName) {
		this.alertSubCategoryName = alertSubCategoryName;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}
