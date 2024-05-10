package com.devoic.devoic.repositorys;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devoic.devoic.model.Usernew;

public interface UserRepository extends JpaRepository<Usernew, Long>{

	@Query(value = "SELECT un.name,un.phno phone,un.address,un.email,un.lname,un.id,ur.role_name Role,ur.is_active from usernew un\r\n"
			+ "inner join user_role ur on un.role=ur.id WHERE un.name =?1 AND un.password =?2", nativeQuery = true)
	Usernew loginuser(String uname, String password);

	@Query(value="select phno FROM  Usernew  WHERE phno=?1 ",nativeQuery = true)
	Map<String, Object> find_phoneNo(String phone);

	
	@Query(value="SELECT * FROM Usernew WHERE phno=?1",nativeQuery = true)
	Map<String, Object> findalldetails(String phone);
	
	@Query(value = "SELECT un.name,un.phno phone,un.address,un.email,un.lname,un.id,ur.role_name,ur.is_active from usernew un\r\n"
			+ "inner join user_role ur on un.role=ur.id WHERE un.name =?1 AND un.password =?2", nativeQuery = true)
	Map<String,Object> user_Login(String uname, String password);
	

}
