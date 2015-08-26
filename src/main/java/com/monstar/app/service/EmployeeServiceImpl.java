package com.monstar.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.monstar.app.dao.EmployeeDao;
import com.monstar.app.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;
	
	private EmployeeDao getEmployeeDao(){
		return employeeDao;
	}

	@Override
	public int getTotalNumberOfEmployees() {
		return getEmployeeDao().getTotalNumberOfEmployees();
	}

	@Override
	@Transactional
	public void insertEmployee(Employee employee) {
		getEmployeeDao().insertEmployee(employee);
	}

}
