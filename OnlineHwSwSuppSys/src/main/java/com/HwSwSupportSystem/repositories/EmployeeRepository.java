package com.HwSwSupportSystem.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HwSwSupportSystem.beans.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	public List<Employee> findByEmpEmailAndEmpPassword(String empEmail,String empPassword);	

}
