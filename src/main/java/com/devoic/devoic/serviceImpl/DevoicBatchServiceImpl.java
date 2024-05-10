package com.devoic.devoic.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.devoic.devoic.interfaces.DevoicBatchInterface;
import com.devoic.devoic.model.DevoicBatch;
import com.devoic.devoic.repositorys.DevoicBatchrepository;

public class DevoicBatchServiceImpl implements DevoicBatchInterface {
 @Autowired
 private DevoicBatchrepository  devoicBatchrepository;

@Override
public List<DevoicBatch> dblist() {
	// TODO Auto-generated method stub
	return devoicBatchrepository.findAll();
}

@Override
public DevoicBatch Savedb(DevoicBatch devoicbatch) {
	// TODO Auto-generated method stub
	return null;
}
	

}
