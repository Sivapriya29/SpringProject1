package com.HwSwSupportSystem.service;

import com.HwSwSupportSystem.beans.Task;
import com.HwSwSupportSystem.exceptions.ComplaintNotFoundException;

public interface TaskService {
	public Task getComplaintById(Integer compId) throws ComplaintNotFoundException;
	//public Task getComplaintByEngId(Integer engId);
///@Query()
	Task getComplaintByEngId(Iterable<Integer> engId);

}
