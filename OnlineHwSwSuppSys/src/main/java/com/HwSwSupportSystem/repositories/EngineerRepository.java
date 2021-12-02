package com.HwSwSupportSystem.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HwSwSupportSystem.beans.Engineer;

public interface EngineerRepository extends JpaRepository<Engineer, Integer> {

	public List<Engineer> findByEngEmailAndEngPassword(String engEmail,String engPassword);	

}
