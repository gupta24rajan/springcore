package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
   public static void main(String []args) {
	    ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/standalone/collection/Standaloneconfig.xml");
	    
	               Person p=(Person) context.getBean("person1");
	               System.out.println(p);
	               System.out.println("----------------------------------------------");
	 
	               System.out.println(p.getFriends());
	               System.out.println(p.getFriends().getClass().getName());
	               
	               System.out.println("----------------------------------------------");
	               System.out.println(p.getCourse());
	               System.out.println(p.getCourse().getClass().getName());
	               
	               System.out.println("----------------------------------------------");
	               System.out.println(p.getProp());
	               System.out.println(p.getProp().getClass().getName());
   }
  
}
