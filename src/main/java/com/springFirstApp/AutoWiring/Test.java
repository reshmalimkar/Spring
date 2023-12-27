package com.springFirstApp.AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test { 
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springFirstApp/AutoWiring/autoconfig.xml");
		//Emp emp = (Emp)context.getBean("emp");
		Emp emp = context.getBean("emp",Emp.class);
		System.out.println(emp);
	}

}
