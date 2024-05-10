package com.devoic.devoic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
//@Table(name="Users")s
public class Usernew {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	String name;
	String lname;
	String dob;
	String email;
	String address;
	String state;
	String postal_code;
	String country;
	String gender;
	String phno;
	String Role;
	String password;
	
	
	
	
	
	public Usernew() {
		super();
		// TODO Auto-generated constructor stub
	}



	


	public Usernew(Long id, String name, String lname, String dob, String email, String address, String state,
			String postal_code, String country, String gender, String phno, String role, String password) {
		super();
		this.id = id;
		this.name = name;
		this.lname = lname;
		this.dob = dob;
		this.email = email;
		this.address = address;
		this.state = state;
		this.postal_code = postal_code;
		this.country = country;
		this.gender = gender;
		this.phno = phno;
		Role = role;
		this.password = password;
	}






	public Long getId() {
		return id;
	}





	public void setId(Long id) {
		this.id = id;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getLname() {
		return lname;
	}





	public void setLname(String lname) {
		this.lname = lname;
	}





	public String getDob() {
		return dob;
	}





	public void setDob(String dob) {
		this.dob = dob;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public String getAddress() {
		return address;
	}





	public void setAddress(String address) {
		this.address = address;
	}





	public String getState() {
		return state;
	}





	public void setState(String state) {
		this.state = state;
	}





	public String getPostal_code() {
		return postal_code;
	}





	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}





	public String getCountry() {
		return country;
	}





	public void setCountry(String country) {
		this.country = country;
	}





	public String getGender() {
		return gender;
	}





	public void setGender(String gender) {
		this.gender = gender;
	}





	public String getPhno() {
		return phno;
	}





	public void setPhno(String phno) {
		this.phno = phno;
	}





	public String getRole() {
		return Role;
	}





	public void setRole(String role) {
		Role = role;
	}





	public String getPassword() {
		return password;
	}





	public void setPassword(String password) {
		this.password = password;
	}





	@Override
	public String toString() {
		return "Usernew [id=" + id + ", name=" + name + ", lname=" + lname + ", dob=" + dob + ", email=" + email
				+ ", address=" + address + ", state=" + state + ", postal_code=" + postal_code + ", country=" + country
				+ ", gender=" + gender + ", phno=" + phno + ", Role=" + Role + ", password=" + password + "]";
	}
	
	

	
	

}
