package com.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.extractor.EmployeeRsExtractor;
import com.spring.mapper.EmployeeMapper;
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
	
	
	public int saveEmployee(Employee e){  
	    String query="insert into employee(emp_id,name,salary) values(?,?,?)";  
	    return jdbcTemplate.update(query,new Object[]{e.getEmpId(),e.getName(),e.getSalary()});  
	}  
	
	/*public List<Employee> findEmp(int empId){
		String sqlQuery = "select * from employee";
		List<Employee> emp = jdbcTemplate.query(sqlQuery,new EmployeeRsExtractor());
		return emp;
	}*/
	
	
	public List<Employee> findEmp(int empId){
		String sqlQuery = "select * from employee";
		List<Employee> emp = jdbcTemplate.query(sqlQuery,new EmployeeRsExtractor());
		return emp;
	}
}	
	
