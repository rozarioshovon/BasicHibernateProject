package com.monstar.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monstar.app.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;

	@Override
	public int getTotalNumberOfEmployees() {
		return employeeDao.getTotalNumberOfEmployees();
	}

}
