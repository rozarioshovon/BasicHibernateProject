package com.monstar.app.dao;

import com.monstar.app.entity.Employee;

public interface EmployeeDao {
	int getTotalNumberOfEmployees();
	
	void insertEmployee(Employee employee);
}
