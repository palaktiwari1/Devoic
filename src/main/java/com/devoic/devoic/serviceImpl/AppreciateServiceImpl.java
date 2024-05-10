package com.devoic.devoic.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devoic.devoic.interfaces.AppreciateInterface;
import com.devoic.devoic.model.Appreciate;
import com.devoic.devoic.repositorys.AppreciateRepository;

@Service
public class AppreciateServiceImpl implements AppreciateInterface{
     
	@Autowired
	private AppreciateRepository appriAppreciateRepository;
	
	@Override
	public List<Appreciate> aplist() {
		// TODO Auto-generated method stub
		return appriAppreciateRepository.findAll();
	}

	@Override
	public Appreciate savehello(Appreciate appreciate) {
		// TODO Auto-generated method stub
		return appriAppreciateRepository.save(appreciate);
	}

	public AppreciateRepository getAppriAppreciateRepository() {
		return appriAppreciateRepository;
	}

	public void setAppriAppreciateRepository(AppreciateRepository appriAppreciateRepository) {
		this.appriAppreciateRepository = appriAppreciateRepository;
	}

}
