package com.spring.extractor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.spring.model.Employee;


public class EmployeeRsExtractor implements ResultSetExtractor<List<Employee>>{

	public List<Employee> extractData(ResultSet rs) throws SQLException,
			DataAccessException {
		System.out.println("extractData");
		  List<Employee> empList = new ArrayList<Employee>();
        while(rs.next()){  
        	 Employee e=new Employee();
        e.setEmpId(rs.getInt(1));  
        e.setName(rs.getString(2));  
        e.setSalary(rs.getInt(3));  
        empList.add(e);
        }  
        return empList;  
	}

}
