package com.devoic.devoic.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.devoic.devoic.interfaces.CourseMasterInterface;
import com.devoic.devoic.model.CourseMaster;
import com.devoic.devoic.repositorys.CoureMasterRepository;

public class CourseMasterServiceImpl implements CourseMasterInterface {

	@Autowired
    private CoureMasterRepository coursemasterrepository ;

	@Override
	public List<CourseMaster> coursemlist() {
		// TODO Auto-generated method stub
		return coursemasterrepository.findAll();
	}
	
	

}
