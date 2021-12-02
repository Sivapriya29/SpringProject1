package com.HwSwSupportSystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.HwSwSupportSystem.beans.Engineer;
import com.HwSwSupportSystem.repositories.EngineerRepository;

@Controller
public class EngineerController {

	@Autowired
	EngineerRepository er;
	
	@GetMapping("/engineer")
	public String launchengineerformHandler() {

		return "AddEngineer";
	}
	@PostMapping("/AddingEngineer")
	public ModelAndView saveEngineer(Engineer engineer) {
		Engineer result =er.save(engineer);
		ModelAndView mv = new ModelAndView("EngineerFormSuccess");
		mv.addObject("ans", result);
		System.out.println("inside Student Register handler..");

		return mv;
	}
	
	
}
