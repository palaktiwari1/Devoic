package com.devoic.devoic.controller;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.devoic.devoic.model.Appreciate;
import com.devoic.devoic.model.Employee;
import com.devoic.devoic.model.Experience;
import com.devoic.devoic.model.Roles;
import com.devoic.devoic.model.Usernew;
import com.devoic.devoic.serviceImpl.AppreciateServiceImpl;
import com.devoic.devoic.serviceImpl.EmployeeServiceImpl;
import com.devoic.devoic.serviceImpl.ExperienceServiceImpl;
import com.devoic.devoic.serviceImpl.UserServiceImpl;

import jakarta.servlet.http.HttpSession;


@Controller
//@RequestMapping("Test")
public class UiController {
	

	
	@Autowired
	private UserServiceImpl userServiceImpl ;
	@Autowired
	ExperienceServiceImpl experienceServiceImpl;
	@Autowired
	AppreciateServiceImpl appreciateServiceImpl;
	
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	
	
	@GetMapping("/")
	public String indexfile() {
		
		return "index";
	}
	
	
	
	@GetMapping("login")
	public String login(ModelMap modelMap) {
		
		System.out.println("Test");
		boolean condition = false; // or false based on your logic
		modelMap.addAttribute("condition", condition);
		modelMap.addAttribute("error", "Wrong Password");
		//return "redirect:/dashboard";
		return "Sign_up";
	}
	
	@PostMapping("/login")
	public String userlogin(ModelMap modelMap,String uname,String password,HttpSession session) {
		
		try {
			
			//Usernew users=userServiceImpl.logindetails(uname, password);
			Map<String,Object> users=userServiceImpl.userLogin(uname, password);			
			System.out.println(users.get("name"));
			System.out.println(users.get("Role"));//Role
			//if (uname.equalsIgnoreCase(users.getName())) {
			if (uname.equalsIgnoreCase(users.get("name").toString())) {
				
				System.out.println(uname+"Pass"+password);
				session.setAttribute("id", "palak");
				boolean condition = false; // or false based on your logic
				modelMap.addAttribute("condition", condition);
				
				return "redirect:/dashboard";
			}else {
				
				boolean condition = true; // or false based on your logic
				modelMap.addAttribute("condition", condition);				 
				modelMap.addAttribute("error", "Wrong Password");
				return "Sign_up";	
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			boolean condition = true; // or false based on your logic
			modelMap.addAttribute("condition", condition);			 
			modelMap.addAttribute("error","Wrong Password");
			return "Sign_up";
		}
		
		
		
		//return "Sign_up";
	}
	
	@GetMapping("reg")
	public String Register() {
		
	return "register";
	}   
	
	
	@PostMapping("register_user")
	public String RegisterUser(String fname,String lname,String email
			,String Locality,String address,String State,String Zip,String dob
			,String gender,String phone,String password,String cnf_password) {
		
		
		Usernew user=new Usernew();
		user.setName(fname);
		user.setLname(lname);
		user.setAddress(address);
		user.setEmail(email);
		user.setState(State);
		user.setPostal_code(Zip);
		user.setPhno(phone);
		user.setPassword(password);
		user.setGender(gender);
		user.setDob(dob);
		user.setRole("2");
		user.setCountry(Locality);
		
		Usernew savedata=userServiceImpl.Saveuser(user);
		System.out.println(savedata);
				
		
		
	return "redirect:/dashboard";
	}
	
	@GetMapping("Error_page")
	public String Error() {
		return "error";}
	
	
	@GetMapping("/forgot_password")
	public String Forgot()
	{
		return "forgotpw";
	}
	
	
	
	@GetMapping("Privacy_policy_page")
	public String Privacy_policy()
	{
		return "privacy";
	}
	
	
	
	@GetMapping("Terms_page")
	public String terms()
	{
		return "terms";
	}
	
	
	@GetMapping("Verify_page")
	public String verifycertificates()
	{
	  return "verifycertificates";	
	}
	
	
	@GetMapping("View_page")
	public String viewcertificates()
	{
		
	return "viewcertificate";
	}
	
	@GetMapping("employee/mng_emp")
	public String manageEmp(HttpSession session,ModelMap modelMap)
	{
		
		
		List<Roles> rolelist=userServiceImpl.rolelist();
		rolelist.add(0, new Roles(0, "Select", null, null, null, null));
		
		modelMap.addAttribute("Roles", rolelist);
		
	  return "dashboard/manageemp";	
	}
	
	@GetMapping("/dashboard")
	public String dashboard(HttpSession session)
	{
		
		System.out.println("Session"+session.getAttribute("id"));
		return "/dashboard/index";
	}
	
	
	
	@GetMapping("/manageEmp")
	public String Maneage_emp(HttpSession session,ModelMap modelMap)
	{
		
		List<Roles> rolelist=userServiceImpl.rolelist();
		rolelist.add(0, new Roles(0, "Select", null, null, null, null));
		
		List<Employee> empList=employeeServiceImpl.employeelist();
		
		modelMap.addAttribute("Roles", rolelist);
		modelMap.addAttribute("empList", empList);
		
		return "/dashboard/manageemp";
	}
	
	
	@PostMapping("/save_emp")
	public String saveemp(String edit_name,String edit_email,String edit_address,String edit_phno
			,String edit_id,String state) {
		//edit_name,edit_email,edit_address,edit_phno
		
		Employee employee=employeeServiceImpl.Findemployee(edit_id);
		
		Employee emp=new Employee();
		emp.setPassword(emp.getPassword());
		emp.setName(edit_name);
		emp.setEmail(edit_email);
		emp.setAddress(edit_address);
		emp.setPhno(edit_phno);
		emp.setRoles(state);
		emp.setEmpId(Long.parseLong(edit_id));
		Employee emm=employeeServiceImpl.Savemployee(emp);
		
		
		
		System.out.println("edit_address"+edit_address);
		System.out.println("edit_phno"+edit_phno);
		//return "/dashboard/manageemp";
		return "redirect:/manageEmp";
		//return ""; 
	}
	
	
	
	@PostMapping("/save_emps")
	public String saveemps(String name_add,String email_add,String address_add,String phone_add,String roles,String password) {
		//edit_name,edit_email,edit_address,edit_phno
		Employee addemp=new Employee();
		addemp.setName(name_add);
		addemp.setEmail(email_add);
		addemp.setAddress(address_add);
		addemp.setPhno(phone_add);
		addemp.setRoles(roles);
		addemp.setPassword(password);
		
		Employee saveemp=employeeServiceImpl.Savemployee(addemp);
		
		System.out.println(saveemp);
		
		
		
		System.out.println("add_address"+address_add);
		System.out.println("add_phno"+phone_add);
		
		return "redirect:/manageEmp";
		//return "/dashboard/manageemp";
		//return "";
	}
	
	
	@GetMapping("/GenCert")
	public String Generate_Certificate()
	{
		return "/dashboard/gencert";
	}
	
	
	@GetMapping("/Completion")
	public String Cert_completes()	{
		
		
	return "dashboard/complete";
	}
	
	@PostMapping("/Completion")
	public String Cert_complete(String certificate_name1,String certificate_portfolio1,String certificate_duration1,String certificate_designation1)
	{System.out.println("certificate_empid1"+certificate_portfolio1);
	System.out.println("certificate_name1post"+certificate_name1);
	
	Experience exep=new Experience();
	exep.setEmpname(certificate_name1);
	exep.setDesignation(certificate_designation1);
	exep.setDuration(certificate_duration1);
	exep.setPortfolio(certificate_portfolio1);
	
	
	Experience saveexp=experienceServiceImpl.Saveexp(exep);
	
	
	System.out.println(saveexp);
	
	return "dashboard/complete";
	}
	
	@GetMapping("/appreciation")
	public String Cert_app()
	{
		return "dashboard/appreciate";
	}
	
	
	@PostMapping("/appreciation")
	public String Cert_apps(String certificate_name2,String certificate_empid2,String certificate_duration2,String certificate_field2)
	{
	System.out.println("certificate_name1post"+certificate_name2);
		Appreciate ap=new Appreciate();
       ap.setEmpname(certificate_name2);
       ap.setDate(certificate_duration2);
       ap.setCerti_field(certificate_field2);
   
       
       
		return "redirect:/appreciation";
	}
	
	
	@GetMapping("/add_emps")
	public String addemp()
	{
		//return "dashboard/manageemp";	
	return "redirect:/employee/mng_emp";
	}
	
	@GetMapping("/phno")
	public String phone(String ph_no)
	{
		return ph_no;
		
	}
	
	@GetMapping("/userlistbyPhone")
	public Map<String, Object> findPhones(String phone){
		
		Map<String,Object> userdata=userServiceImpl.findPhone(phone);
		
		return userdata;
	}
	
	@GetMapping("/delete_emp/{id}")
	private String deleteRecord(ModelMap modelMap,HttpSession session
			,@PathVariable(name="id") String id) {
		System.out.println("OK");
		System.out.println(id);
		
		employeeServiceImpl.del_user(id);
		
		
		return "redirect:/manageEmp";
	}
	
	
	
	
}
