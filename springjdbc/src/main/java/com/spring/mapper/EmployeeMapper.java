package com.spring.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.model.Employee;

public class EmployeeMapper implements RowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int rowNumb) throws SQLException {
		System.out.println("map row called");
		Employee emp = new Employee();
		emp.setEmpId(rs.getInt("emp_id"));
		emp.setName(rs.getString("name"));
		emp.setSalary(rs.getInt("salary"));
		return emp;
	}

}


