package com.devoic.devoic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Appreciate {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long empid;
    String empname;

	String date;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCerti_field() {
		return certi_field;
	}
	public void setCerti_field(String certi_field) {
		this.certi_field = certi_field;
	}
	String certi_field;

}
