package com.Rajan.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    
    ApplicationContext context=new ClassPathXmlApplicationContext("com/Rajan/springcore/config.xml");
    
    Student std1=(Student) context.getBean("student1");
    System.out.println(std1);
    
    Student std2=(Student) context.getBean("student2");
    System.out.println(std2);
    
    // test comment
  }
}
