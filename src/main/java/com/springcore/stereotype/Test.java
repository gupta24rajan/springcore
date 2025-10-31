package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
   public static void main(String[]args) {
	   ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/stereotype/Stereotypeconfig.xml");
	          // Student std= con.getBean("student",Student.class);
	       Student std= con.getBean("obj",Student.class);
	           System.out.println(std);
	           
	           System.out.println(std.getAddress());
	           System.out.println(std.getAddress().getClass().getName());
	           
	           System.out.println(std.hashCode());
	           Student std1= con.getBean("obj",Student.class);
	           System.out.println(std1.hashCode());
	           
	         
	           // scope("prototype)
	           Teacher tec1= con.getBean("teacher",Teacher.class);
	           Teacher tec2= con.getBean("teacher",Teacher.class);
	           
	           System.out.println(tec1.hashCode());
	           System.out.println(tec2.hashCode());
	           
   }
}
