package com.monstar.app.service;

import com.monstar.app.entity.Employee;

public interface EmployeeService {
	int getTotalNumberOfEmployees();
	void insertEmployee(Employee employee);
}
