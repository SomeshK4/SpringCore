package com.spring.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dao.EmployeeDao;
import com.spring.model.Employee;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringBeans.xml");
		EmployeeDao empDao = (EmployeeDao) ctx.getBean("empDao");
		
		/**
		 * creating table employee
		 */
		//empDao.createEmpTable();
		
		Employee emp = new Employee();
		emp.setEmpId(10);
		emp.setName("sumit");
		emp.setSalary(1000);
		
		/**
		 * saving records into the employee table
		 */
		try {
			empDao.saveEmployee(emp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
