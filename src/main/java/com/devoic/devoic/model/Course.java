package com.devoic.devoic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
//@Table(name="course_tb")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long course_id;
	String course_name;
	String duration;
    String amt;
    String start_date;
    String end_date;
    
}
