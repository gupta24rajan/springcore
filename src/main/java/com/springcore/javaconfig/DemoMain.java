package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		ApplicationContext con=new 
				AnnotationConfigApplicationContext(JavaConfig.class);
		//Student std=con.getBean("firstStudent",Student.class);
		Student std=con.getBean("temp",Student.class);
		System.out.println(std);
		std.study();

	}

}
