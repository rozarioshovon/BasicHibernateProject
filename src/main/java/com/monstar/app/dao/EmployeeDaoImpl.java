package com.monstar.app.dao;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.monstar.app.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	JdbcTemplate jdbcTemplate;
	
	SessionFactory sessionFactory;
	
	public JdbcTemplate getJdbcTemplate(){
		return jdbcTemplate;
	}
	
	@Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
	
	public SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}

	@Override
	public int getTotalNumberOfEmployees() {
		return getJdbcTemplate().queryForInt("select count(*) as employeeCount from employee");
	}

	@Override
	public void insertEmployee(Employee employee) {
		getSessionFactory().getCurrentSession().saveOrUpdate(employee);		
	}


}
