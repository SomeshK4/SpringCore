package com.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;


import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.spring.model.Employee;



public class EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void createEmpTable(){
		
		String createTableSQL = "CREATE TABLE Employee("
				+ "EMP_ID NUMBER(5) NOT NULL, "
				+ "NAME VARCHAR(20) NOT NULL, "
				+ "SALARY INT NOT NULL, "
				+ "PRIMARY KEY (EMP_ID) "
				+ ")";
		
		jdbcTemplate.execute(createTableSQL);
		
	}
	
	/**
	 * Transaction will be rolled back only for RuntimeExceptions
	 * 
	 */
	@Transactional
	public void saveEmployee(Employee e){  
	    String query="insert into employee(emp_id,name,salary) values(?,?,?)";  
	   
	    	 jdbcTemplate.update(query,new Object[]{e.getEmpId(),e.getName(),e.getSalary()});  
		     throw new RuntimeException("rolling back");
	}  

}	
	
