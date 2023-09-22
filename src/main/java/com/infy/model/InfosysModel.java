package com.infy.model;

public class InfosysModel {

	private String name;

	private String email;

	private String planname;

	private String planstatus;

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
		return "InfosysModel [name=" + name + ", email=" + email + ", planname=" + planname + ", planstatus="
				+ planstatus + "]";
	}

}
