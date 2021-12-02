package com.HwSwSupportSystem.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.HwSwSupportSystem.beans.Complaint;
import com.HwSwSupportSystem.exceptions.ComplaintNotFoundException;
import com.HwSwSupportSystem.repositories.ComplaintRepository;
import com.HwSwSupportSystem.repositories.TaskRepository;
import com.HwSwSupportSystem.service.ComplaintService;;

@Controller
public class ComplaintController {
	
	@Autowired
	ComplaintRepository cr;
	@Autowired
	ComplaintService cs;
	
@Autowired
TaskRepository tr;
	 @GetMapping("/assigntask")
		
		public ModelAndView doGetAllComplaints() {

			List<Complaint> complaints = cr.findAll();
			

			ModelAndView mv = new ModelAndView("AssignTask");

			mv.addObject("compList", complaints);
			return mv;
		 }
	 @GetMapping("/getcomplaintdesc")
		
		public ModelAndView doGetAllComplaintsdesc() {

			List<Complaint> complaints = cr.findAll();
			

			ModelAndView mv = new ModelAndView("ComplaintTaskDesc");

			mv.addObject("compList", complaints);
			return mv;
		 }
	 
	

	@GetMapping("/complaint")
	public String homeLauncher() {

		return "ComplaintForm";

	}

	@PostMapping("/registeringcomplaint")
	public ModelAndView saveComplaint(@Valid Complaint complaint, BindingResult br ) {
		Complaint result = cr.save(complaint);
		ModelAndView mv = new ModelAndView("ComplaintFormSuccess");
		mv.addObject("ans", result);
		System.out.println("inside Student Register handler..");

		return mv;
	}
	
	
	
	
	@GetMapping("/gettingComplaintByEmpId")
	public ModelAndView dogettingComplaintByEmpId(Integer empId) throws ComplaintNotFoundException {
		if(empId ==50) {
			throw new IllegalArgumentException("illegal Argument");
		}

		Complaint  complaints = cs.getComplaintById(empId);

		ModelAndView mv = new ModelAndView("DisplayComplaintByEmpId","comp", complaints);

		return mv;

	}
	
	

	
	@GetMapping("/getComplaintById")
	public String getComplaintByIdFormLauncher() {
			
		return "GetComplaintByIdForm";
		
	}
	
	
	
	
	
	
	
	

	
	
	
	
}
