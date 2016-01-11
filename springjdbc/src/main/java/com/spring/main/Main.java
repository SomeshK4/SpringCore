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
		emp.setEmpId(2);
		emp.setName("sumit");
		emp.setSalary(1000);
		
		/**
		 * saving records into the employee table
		 */
		//empDao.saveEmployee(emp);
		
		/**
		 * getting records from the database
		 */
		
		List<Employee> employee = empDao.findEmp(1);
		System.out.println(employee.size());
		/*System.out.println("Employee ID :"+employee.getEmpId());
		System.out.println("Employee Name :"+employee.getName());
		System.out.println("Employee Salary: "+employee.getSalary());*/
		
		//List<Employee> employeeLst = empDao.findEmp(1);
		//System.out.println(employeeLst.size());
		//System.out.println(employee.size());
		
	}

}
