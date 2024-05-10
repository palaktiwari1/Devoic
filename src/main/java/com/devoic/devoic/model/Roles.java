package com.devoic.devoic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="UserRole")
public class Roles {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
    long id;
 
	String RoleName;
	String Description;
	String datetime;
	String isActive;
	String isStatus;
	
	
	
	
	public Roles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Roles(long id, String roleName, String description, String datetime, String isActive, String isStatus) {
		super();
		this.id = id;
		RoleName = roleName;
		Description = description;
		this.datetime = datetime;
		this.isActive = isActive;
		this.isStatus = isStatus;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getRoleName() {
		return RoleName;
	}
	
	public void setRoleName(String roleName) {
		RoleName = roleName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	
	public String getIsStatus() {
		return isStatus;
	}
	
	public void setIsStatus(String isStatus) {
		this.isStatus = isStatus;
	}
	
	

}
