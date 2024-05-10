package com.devoic.devoic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Teacher_Master {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
long tm_id;
String name;
String experience;
String expertise;
}
