package com.devoic.devoic.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.devoic.devoic.interfaces.Teacher_MasterInterface;
import com.devoic.devoic.model.Teacher_Master;
import com.devoic.devoic.repositorys.Teacher_MasterRepository;

public class Teacher_MasterServiceImpl implements Teacher_MasterInterface{
 @Autowired
 private Teacher_MasterRepository teacher_masterRepository;

@Override
public List<Teacher_Master> tmlist() {
	// TODO Auto-generated method stub
	return teacher_masterRepository.findAll();
}

@Override
public Teacher_Master savetn(Teacher_Master teacher_master) {
	// TODO Auto-generated method stub
	return teacher_masterRepository.save(teacher_master);
}
	

}
