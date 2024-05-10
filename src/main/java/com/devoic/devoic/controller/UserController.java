package com.devoic.devoic.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.devoic.devoic.model.Employee;
import com.devoic.devoic.model.ResponseHandler;
import com.devoic.devoic.model.Roles;
import com.devoic.devoic.model.Usernew;
import com.devoic.devoic.repositorys.EmployeeRepository;
import com.devoic.devoic.serviceImpl.UserServiceImpl;

@RestController
@RequestMapping("v1")
public class UserController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("userdetails")
	public ResponseEntity<Object> Getdataa() {
		
		try {
			
			
			List<Usernew> userlist=userServiceImpl.userlist();
			userlist.add(4, new Usernew(5L, "Yogesh", "Yogesh", "Yogesh", "Yogesh", "Yogesh", "Yogesh", "Yogesh", "Yogesh", "Yogesh", "Yogesh","User" ,"Yogesh"));
			
			
			if (userlist !=null) {
				
				List<Employee> emp=employeeRepository.findAll();
				
				List<Map<String,Object>> emp2=employeeRepository.listallemp();
				
				
				Map<String, Object> map = new HashMap<String, Object>();
		        map.put("message", userlist);
		        map.put("emp1", emp);
		        map.put("emp2", emp2);
		        map.put("status", true);
		        
				
				 return new ResponseEntity<Object>(map,HttpStatus.OK);
				///return ResponseHandler.response("success", "userlist", HttpStatus.OK,userlist, true);
				
			}else {
				return ResponseHandler.response("Failed", "userlist", HttpStatus.OK,userlist, false);
					
			}
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
			return ResponseHandler.response(e.getMessage(), "userlist", HttpStatus.MULTI_STATUS,null, false);
			
		}
		
	  
	}
	
	
	
	@GetMapping("/user_roles")
	public ResponseEntity<Object> UserRoles() {
		
		try {
			
			
			
			List<Roles> rolelist=userServiceImpl.rolelist();
			
			
			if (rolelist !=null) {
				return ResponseHandler.response("success", "rolelist", HttpStatus.OK,rolelist, true);
				
			}else {
				return ResponseHandler.response("Failed", "Role", HttpStatus.OK,rolelist, false);
					
			}
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
			return ResponseHandler.response(e.getMessage(), "Roles", HttpStatus.MULTI_STATUS,null, false);
			
		}
		
	  
	}
	
	
	
	@GetMapping("/phno")
	public String phone(String ph_no)
	{
		
		String str_phone=userServiceImpl.phone(ph_no);
		 str_phone="7777";
		
		return str_phone;
		
	}
	
	@GetMapping("/userlistbyPhone")
	public Map<String, Object> findPhones(String phone){
		
		Map<String,Object> userdata=userServiceImpl.findPhone(phone);
		
		return userdata;
	}
	
	

}
