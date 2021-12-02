package com.HwSwSupportSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HwSwSupportSystem.beans.Engineer;
import com.HwSwSupportSystem.repositories.EngineerRepository;

@Service
public class EngineerServiceImpl implements EngineerService{

	@Autowired
	 EngineerRepository engineerRepository;

	@Override
	public Engineer addEngineer(Engineer engineer) {
		
		return engineerRepository.save(engineer);
	}

}
