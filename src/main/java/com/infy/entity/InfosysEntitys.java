package com.infy.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InfosysEntitys {

	@Id
	private String infyId;

	private String name;

	private String email;

	private LocalDateTime createddate;

	private String planname;

	private String planstatus;

	public String getInfyId() {
		return infyId;
	}

	public void setInfyId(String infyId) {
		this.infyId = infyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getCreateddate() {
		return createddate;
	}

	public void setCreateddate(LocalDateTime createddate) {
		this.createddate = createddate;
	}

	public String getPlanname() {
		return planname;
	}

	public void setPlanname(String planname) {
		this.planname = planname;
	}

	public String getPlanstatus() {
		return planstatus;
	}

	public void setPlanstatus(String planstatus) {
		this.planstatus = planstatus;
	}

	@Override
	public String toString() {
		return "InfosysEntity [infyId=" + infyId + ", name=" + name + ", email=" + email + ", createddate="
				+ createddate + ", planname=" + planname + ", planstatus=" + planstatus + "]";
	}

}
