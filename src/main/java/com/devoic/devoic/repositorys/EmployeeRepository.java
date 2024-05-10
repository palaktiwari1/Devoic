package com.devoic.devoic.repositorys;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devoic.devoic.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	@Query(value="SELECT * FROM emp_tb",nativeQuery = true)
	List<Map<String,Object>> listallemp();
	
	
	@Query(value="SELECT * FROM emp_tb",nativeQuery = true)
//	List<Map<String,Object>> listallemp();
	List<Employee> listallemp2();

}
