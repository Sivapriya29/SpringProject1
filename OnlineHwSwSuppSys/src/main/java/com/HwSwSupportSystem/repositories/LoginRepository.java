package com.HwSwSupportSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.HwSwSupportSystem.beans.Login;

public interface LoginRepository extends JpaRepository<Login, String> {

	

	
	/*@Query("from Login where username=:username AND password=:password AND role=:role")

	Login validateUser(String username, String password, String role);*/



}
