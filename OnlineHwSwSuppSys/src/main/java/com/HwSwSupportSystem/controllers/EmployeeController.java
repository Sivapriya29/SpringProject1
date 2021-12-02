package com.HwSwSupportSystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.HwSwSupportSystem.beans.Employee;
import com.HwSwSupportSystem.repositories.EmployeeRepository;
@Controller
public class EmployeeController {
	@Autowired
	EmployeeRepository er;
	@GetMapping("/employee")
	public String launchengineerformHandler() {

		return "AddEmployee";
	}
	@PostMapping("/updatingemployee")
	public ModelAndView updateEngineer(Employee employee) {
		Employee result =er.save(employee);
		ModelAndView mv = new ModelAndView("UpdateEmployeeSuccess");
		mv.addObject("ans", result);

		return mv;
	}
	@GetMapping("/updateemployee")
	public String launchengineerupdateformHandler() {

		return "UpdateEmployee";
	}
	@PostMapping("/AddingEmployee")
	public ModelAndView saveEngineer(Employee employee) {
		Employee result =er.save(employee);
		ModelAndView mv = new ModelAndView("AddEmployeeSuccess");
		mv.addObject("ans", result);

		return mv;
	}
		

}
