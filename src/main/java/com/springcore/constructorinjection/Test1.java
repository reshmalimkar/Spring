package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("/com/springcore/constructorinjection/ciconfig.xml");
	    person p=(person)context.getBean("p");
	    System.out.println(p);
	}

}
