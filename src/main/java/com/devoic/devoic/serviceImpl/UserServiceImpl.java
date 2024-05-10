package com.devoic.devoic.serviceImpl;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devoic.devoic.interfaces.UserInterface;
import com.devoic.devoic.model.Roles;
import com.devoic.devoic.model.Usernew;
import com.devoic.devoic.repositorys.RoleRepository;
import com.devoic.devoic.repositorys.UserRepository;

@Service
public class UserServiceImpl implements UserInterface{
	@Autowired
	private UserRepository userRepository;
	
	
	
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public List<Usernew> userlist() {
		// TODO Auto-generated method stub
		
		return userRepository.findAll();
	}

	@Override
	public Usernew Saveuser(Usernew user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}
	
	
	

	@Override
	public Usernew logindetails(String uname, String Password) {
		// TODO Auto-generated method stub
		return userRepository.loginuser(uname,Password);
	}

	@Override
	public List<Roles> rolelist() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

	@Override
	public String phone(String ph_no) {
		// TODO Auto-generated method stub
		Map<String,Object> str_phone=userRepository.find_phoneNo(ph_no);
		String strdata="test";
		System.out.println("str_phone"+str_phone);
		return strdata;
	}

	@Override
	public Map<String, Object> findPhone(String phone) {
		// TODO Auto-generated method stub
		return userRepository.findalldetails(phone);
	}

	@Override
	public Map<String, Object> userLogin(String uname, String Password) {
		// TODO Auto-generated method stub
		return userRepository.user_Login(uname, Password);
	}

	
}
