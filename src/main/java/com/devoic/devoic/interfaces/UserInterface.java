package com.devoic.devoic.interfaces;

import java.util.List;
import java.util.Map;

import com.devoic.devoic.model.Roles;
import com.devoic.devoic.model.Usernew;

public interface UserInterface {
	
	List<Usernew>  userlist();
	
	Usernew Saveuser(Usernew user);
	
	Usernew logindetails(String uname,String Password);
	
	String phone(String ph_no);
	
	Map<String,Object> findPhone(String phone);
	
	List<Roles>  rolelist();
	
	Map<String,Object> userLogin(String uname,String Password);

}
