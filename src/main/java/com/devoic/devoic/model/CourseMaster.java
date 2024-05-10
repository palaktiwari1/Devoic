package com.devoic.devoic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CourseMaster {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
   long course_id;

String name;
String duration;
String amt;
String isactive;
String isStatus;
}
