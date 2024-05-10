package com.devoic.devoic.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devoic.devoic.interfaces.EmployeeInterface;
import com.devoic.devoic.model.Employee;
import com.devoic.devoic.repositorys.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeInterface{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> employeelist() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee Savemployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public void del_user(String idd) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(Long.parseLong(idd));
		
	}

	@Override
	public Employee updateemployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public Employee Findemployee(String idd) {
		// TODO Auto-generated method stub
		return employeeRepository.getReferenceById(Long.parseLong(idd));
	}

}
