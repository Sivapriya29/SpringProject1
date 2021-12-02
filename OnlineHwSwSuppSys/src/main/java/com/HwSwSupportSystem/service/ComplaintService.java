package com.HwSwSupportSystem.service;

import java.util.List;

import com.HwSwSupportSystem.beans.Complaint;
import com.HwSwSupportSystem.exceptions.ComplaintNotFoundException;

public interface ComplaintService {
	
	
	public List<Complaint> getAllComplaintDetails();
	public Complaint updateComplaint(Complaint complaint);
	public Complaint getComplaintById(Integer compId) throws ComplaintNotFoundException;

}
