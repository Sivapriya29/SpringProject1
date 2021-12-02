package com.HwSwSupportSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HwSwSupportSystem.beans.Complaint;
import com.HwSwSupportSystem.exceptions.ComplaintNotFoundException;
import com.HwSwSupportSystem.repositories.ComplaintRepository;

@Service
public class ComplaintServiceImpl implements ComplaintService{
	@Autowired
	ComplaintRepository cr;

	@Override
	public List<Complaint> getAllComplaintDetails() {
		
		return  cr.findAll();
		
	}
	@Override
	public Complaint updateComplaint(Complaint complaint) {
		
		//if the supplied Employee obj has the Id field, then it will perform update and if 
		//id field is not there then it will perform save operation
		return cr.save(complaint);
		
		
		
	}
	/*@Override
	public Complaint getComplaintById(Integer cmpId) throws ComplaintNotFoundException {
		Optional<Complaint> opt=  cr.findById(cmpId);
				
				return opt.get();
	
		}*/
	@Override
	public Complaint getComplaintById(Integer compId) throws ComplaintNotFoundException {
		
		return cr.findById(compId).orElseThrow(() ->new ComplaintNotFoundException("Complaint not found with Id "+compId) );
			
		
	}


	}




