package com.devoic.devoic.interfaces;

import java.util.List;

import com.devoic.devoic.model.Experience;

public interface ExperienceInterface {
      
	List<Experience> explist();
    
	Experience Saveexp(Experience experience);
}
