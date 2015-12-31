package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args) {
 
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/aop/SpringBeans.xml");
        EmployeeManager manager = context.getBean(EmployeeManager.class);
 
        manager.getEmployeeById(1);
    }
}