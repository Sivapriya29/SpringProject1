package com.HwSwSupportSystem.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.HwSwSupportSystem.beans.Employee;
import com.HwSwSupportSystem.beans.Engineer;
import com.HwSwSupportSystem.beans.Login;
import com.HwSwSupportSystem.repositories.EmployeeRepository;
import com.HwSwSupportSystem.repositories.EngineerRepository;
import com.HwSwSupportSystem.repositories.LoginRepository;
import com.HwSwSupportSystem.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	LoginService ls;
	
	@Autowired
	LoginRepository loginDao;
	
	@Autowired
	EngineerRepository engineerDao;
	
	@Autowired
	EmployeeRepository employeeDao;
	
	@GetMapping("/empportal")
	public String launchempportal() {

		return "Employee_Portal";
	}
	@GetMapping("/hodportal")
	public String launchhodportal() {

		return "Hod_Portal";
	}
	@GetMapping("/engportal")
	public String launchengportal() {

		return "Engineer_Portal";
	}
	@GetMapping("/")
	public String homeLauncher() {
		
		return "home";
		
	}
	@GetMapping("/login")
	public String launchLoginFormHandler() {

		return "LoginForm";
	}
	@PostMapping("/doLogin")
	public ModelAndView doLogin(@Valid @ModelAttribute("loginData") Login login,BindingResult br) {
		
		if(br.hasErrors()) {
			return new ModelAndView("LoginForm");
		}
		
		if(login.getRole().equals("hod")) {
			
		 	/*Login res= ls.authenticateUser(login.getUsername(), login.getPassword() ,login.getRole());
		 	
		 	if(res != null)
		 		return new ModelAndView("Hod_Portal","hodlogindata",res);*/
			if(login.getUsername().equals("Admin@gmail.com") && login.getPassword().equals("1234"))
			{
			
			Login savedLog = loginDao.save(login);

			return new ModelAndView("Hod_Portal","hodlogindata", savedLog);
			
			}
		 	
		}
        /* if(login.getRole().equals("employee")) {
			
		 	Login res= ls.authenticateUser(login.getUsername(), login.getPassword() ,login.getRole());
		 	
		 	if(res != null)
		 		return new ModelAndView("Employee_Portal","emplogindata",res);
		 	
		}*/
		else if(login.getRole().equals("engineer"))
		{
			List<Engineer> opt= engineerDao.findByEngEmailAndEngPassword(login.getUsername(),login.getPassword());
			if(!opt.isEmpty())
			{
				System.out.println("List:"+opt);
			
			return new ModelAndView("Engineer_Portal");
			}
		}
         /*if(login.getRole().equals("engineer")) {
 			
 		 	Login res= ls.authenticateUser(login.getUsername(), login.getPassword() ,login.getRole());
 		 	
 		 	if(res != null)
 		 		return new ModelAndView("Engineer_Portal","englogindata",res);
 		 	
 		}*/
		else if(login.getRole().equals("employee"))
		{
			List<Employee> opt= employeeDao.findByEmpEmailAndEmpPassword(login.getUsername(),login.getPassword());
			if(!opt.isEmpty())
			{
				System.out.println("List:"+opt);
			
			return new ModelAndView("Employee_Portal");
			}
		}
				
		return new ModelAndView("LoginForm","flag","Invalid Username or password!!..");
		
	}

}
