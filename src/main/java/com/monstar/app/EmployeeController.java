package com.monstar.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.monstar.app.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("testgetemployeecount")
	public String getEmployeeCount(Model model){
		model.addAttribute("totalNumberOfEmployees", employeeService.getTotalNumberOfEmployees());
		return "employeedefaultpage";
	}
}
