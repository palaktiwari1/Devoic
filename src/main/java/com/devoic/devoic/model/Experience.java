package com.devoic.devoic.model;

//import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
public class Experience {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long empid;
	
	String empname;
	String portfolio;
	String duration;
	String designation;
	public long getEmpid() {
		return empid;
	}
	public void setEmpid(long empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getPortfolio() {
		return portfolio;
	}
	public void setPortfolio(String portfolio) {
		this.portfolio = portfolio;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Experience [empid=" + empid + ", empname=" + empname + ", portfolio=" + portfolio + ", duration="
				+ duration + ", designation=" + designation + "]";
	}
	
	
	
}
