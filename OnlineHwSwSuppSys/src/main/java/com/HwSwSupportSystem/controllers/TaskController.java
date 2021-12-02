package com.HwSwSupportSystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.HwSwSupportSystem.beans.Task;
import com.HwSwSupportSystem.exceptions.ComplaintNotFoundException;
import com.HwSwSupportSystem.repositories.TaskRepository;
import com.HwSwSupportSystem.service.TaskService;

@Controller
public class TaskController {
	@Autowired
	TaskService ts;
	
	@Autowired
	TaskRepository tr;
	@GetMapping("/getcomplaintidstatus")
	public ModelAndView dogetcomplaintidstatus() {

		List<Task> complaints = tr.findAll();

		ModelAndView mv = new ModelAndView("DisplayComplaintIdStatus");

		mv.addObject("compList", complaints);
		return mv;
}

	@GetMapping("/getComplaint")
	public ModelAndView doSearchByCompId(Integer compId) throws ComplaintNotFoundException {
		if(compId ==100) {
			throw new IllegalArgumentException("illegal Argument");
		}

		Task  complaints = ts.getComplaintById(compId);

		ModelAndView mv = new ModelAndView("DisplayComplaintById","comp", complaints);

		return mv;

	}
	@GetMapping("/getcomplaintbyeng")
	public String getComplaintByEmpIdFormLauncher() {
			
		return "GetComplaintByEngIdForm";
		
	}
	@GetMapping("/gettingcomplaintByengid")
	public ModelAndView doSearchByEngId(Integer engId) {

		//List<Task> complaints = tr.findAllById(engId);
		List<Task> complaints = tr.findAll();

		ModelAndView mv = new ModelAndView("DisplayComplaintByEngId");
		mv.addObject("compList", complaints);

		return mv;

	}
	

	@PostMapping("/assigningengineer")
	public ModelAndView saveEngineer(Task task) {
		Task result = tr.save(task);
		ModelAndView mv = new ModelAndView("EngineerAssignFormSuccess");
		mv.addObject("ans", result);
		System.out.println("inside Student Register handler..");

		return mv;
	}
	@GetMapping("/getAllComplaint")
	public ModelAndView doGetAllTask() {

		List<Task> complaints = tr.findAll();

		ModelAndView mv = new ModelAndView("DisplayComplaint");

		mv.addObject("compList", complaints);
		return mv;
	}
	
	@GetMapping("/getcomplaintstatus")
	public ModelAndView dogetcomplaintstatus() {

		List<Task> complaints = tr.findAll();

		ModelAndView mv = new ModelAndView("DisplayComplaintStatus");

		mv.addObject("compList", complaints);
		return mv;
	}
		
		
	@GetMapping("/getengineerstatus")
	public ModelAndView dogetengineerstatus() {

		List<Task> complaints = tr.findAll();

		ModelAndView mv = new ModelAndView("DisplayEngineerStatus");

		mv.addObject("compList", complaints);
		return mv;
	}
	

	@GetMapping("/assigningtask{compId}")
	public String launchemployeeformHandler(@PathVariable Integer complaintId) {

		return "AssignEngineer";
	}
	@GetMapping("/assigningtask")
	public String launchemployeeformHandler() {

		return "AssignEngineer";
	}

	@GetMapping("/updatetask")
	public String doupdatetask() {

		return "TaskUpdateForm";
	}

	@PostMapping("/taskupdating")
	public ModelAndView doupdating(Task task) {
		Task result = tr.save(task);
		ModelAndView mv = new ModelAndView("TaskUpdateFormSuccess");
		mv.addObject("ans", result);
		System.out.println("inside Student Register handler..");

		return mv;
	}

}
