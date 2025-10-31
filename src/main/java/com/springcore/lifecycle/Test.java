package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");

		Apple a1=(Apple)context.getBean("A1");
		System.out.println(a1);
		
		// registering Shutdown Hook method is call by the help of AbstractApplicationContext
		context.registerShutdownHook();
		
		System.out.println("*******************************************");
		Orange o1= (Orange) context.getBean("O1");
		
		System.out.println(o1);
		
		System.out.println("*******************************************");
		Example ex=(Example)context.getBean("example");
		System.out.println(ex);
		
	}

}
