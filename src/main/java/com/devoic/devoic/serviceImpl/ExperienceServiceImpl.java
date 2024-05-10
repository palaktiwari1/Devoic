package com.devoic.devoic.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devoic.devoic.interfaces.ExperienceInterface;
import com.devoic.devoic.model.Experience;
import com.devoic.devoic.repositorys.ExperienceRepository;

@Service
public class ExperienceServiceImpl implements ExperienceInterface{
  @Autowired
  private ExperienceRepository experienceRepository;
	@Override
	public List<Experience> explist() {
		// TODO Auto-generated method stub
		return experienceRepository.findAll();
	}

	@Override
	public Experience Saveexp(Experience experience) {
		// TODO Auto-generated method stub
		return experienceRepository.save(experience);
	}

}
