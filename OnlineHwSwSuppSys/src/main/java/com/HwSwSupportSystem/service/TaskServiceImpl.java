package com.HwSwSupportSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HwSwSupportSystem.beans.Complaint;
import com.HwSwSupportSystem.beans.Task;
import com.HwSwSupportSystem.exceptions.ComplaintNotFoundException;
import com.HwSwSupportSystem.repositories.TaskRepository;
@Service
public class TaskServiceImpl implements TaskService {
	@Autowired
	TaskRepository tr;
	

	@Override
	public Task getComplaintById(Integer compId) throws ComplaintNotFoundException  {
		/*Optional<Task> opt=tr.findById(compId);
				
				return opt.get();*/
		return tr.findById(compId).orElseThrow(() ->new ComplaintNotFoundException("Complaint not found with Id "+compId) );
	}


	@Override
	public Task getComplaintByEngId(Iterable<Integer> engId){
		List<Task> opt=tr.findAllById(engId);
		return opt.get(0);

	}

}
