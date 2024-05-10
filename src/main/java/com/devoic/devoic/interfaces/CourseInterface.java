package com.devoic.devoic.interfaces;

import java.util.List;

import com.devoic.devoic.model.Course;

public interface CourseInterface {

	List<Course> courselist();
	
	Course Savecourse(Course course);

}
