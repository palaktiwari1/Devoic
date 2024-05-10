package com.devoic.devoic.interfaces;
import java.util.List;

import com.devoic.devoic.model.Employee;

public interface EmployeeInterface {
	
List<Employee> employeelist();

Employee Savemployee(Employee employee);

Employee updateemployee(Employee employee);

Employee Findemployee(String idd);

 void del_user(String idd);

}
