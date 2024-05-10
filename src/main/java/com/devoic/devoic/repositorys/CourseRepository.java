package com.devoic.devoic.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devoic.devoic.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
	

}
