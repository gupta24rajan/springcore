package com.springcore.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[]args) {
    	ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/SpEL/SpELconfig.xml");
    	
    	Employee emp=con.getBean("emp",Employee.class);
    	emp.showInfo();
    }
}
