package com.HwSwSupportSystem.exceptions;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(ComplaintNotFoundException.class)
	public String exceptionHandler1(ComplaintNotFoundException exp,Model model) {
		
		System.out.println("inside Complaint Not found exception");
		
		model.addAttribute("expdetails", exp.getMessage());
		
		return "errorhandler";
		
		
	}
	
	
	@ExceptionHandler(Exception.class)
	public String exceptionHandler2(Exception exp,Model model) {
		
		model.addAttribute("expdetails", exp.getMessage());
		
		System.out.println("insdie Exception");
		
		return "errorhandler";

}
}
