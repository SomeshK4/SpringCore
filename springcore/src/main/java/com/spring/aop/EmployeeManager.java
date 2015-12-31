package com.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class EmployeeManager {
	
	
	public void getEmployeeById(Integer employeeId) {
        System.out.println("Method getEmployeeById() called");
    }
 
    public void getAllEmployee() {
        System.out.println("Method getAllEmployee() called");
    }
 
    public void createEmployee() {
        System.out.println("Method createEmployee() called");
    }
 
    public void deleteEmployee(Integer employeeId) {
        System.out.println("Method deleteEmployee() called");
    }
 
    public void updateEmployee() {
        System.out.println("Method updateEmployee() called");
    }

}
