package com.HwSwSupportSystem.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.HwSwSupportSystem.beans.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

	//@Query("select from Task where engId=:engis")
	//public Task findByengId(Integer engId);

}
