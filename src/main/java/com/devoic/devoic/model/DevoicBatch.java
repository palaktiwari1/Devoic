package com.devoic.devoic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DevoicBatch {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
   long id;
 
	String course_id;
	String start_date;
	String end_date;
	String tm_id;
}
