package com.monstar.app;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.monstar.app.entity.Employee;
import com.monstar.app.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("test_employee_count_jdbc")
	public String getEmployeeCountUsingJDBC(Model model){
		model.addAttribute("totalNumberOfEmployees", employeeService.getTotalNumberOfEmployees());
		return "test_employee_count_jdbc";
	}
	
	@RequestMapping("test_employee_count_hibernate")
	public String getEmployeeCountUsingHibernate(Model model){
		employeeService.insertEmployee(newEmployee());
		return "test_employee_count_hibernate";
	}
	
	private Employee newEmployee(){
		Employee employee = new Employee();
		employee.setName("Employee " + new Random().nextInt(10));
		return employee;
	}
}
