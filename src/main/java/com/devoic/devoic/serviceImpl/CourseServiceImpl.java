package com.devoic.devoic.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devoic.devoic.interfaces.CourseInterface;
import com.devoic.devoic.model.Course;
import com.devoic.devoic.repositorys.CourseRepository;

@Service
public class CourseServiceImpl implements CourseInterface {

	@Autowired
	private CourseRepository courseRepository;

	@Override
	public List<Course> courselist() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}

	@Override
	public Course Savecourse(Course course) {
		// TODO Auto-generated method stub
		return courseRepository.save(course);
	}

	
	
	
	
}
