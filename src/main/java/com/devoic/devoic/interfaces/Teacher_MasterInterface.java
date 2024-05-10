package com.devoic.devoic.interfaces;

import java.util.List;

import com.devoic.devoic.model.Teacher_Master;

public interface Teacher_MasterInterface {
     
	List<Teacher_Master> tmlist();
    
	Teacher_Master savetn(Teacher_Master teacher_master);
}
