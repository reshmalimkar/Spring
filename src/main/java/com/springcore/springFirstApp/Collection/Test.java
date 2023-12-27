package com.springcore.springFirstApp.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("collectionconfig.xml");
		//Emp obj =(Emp)context.getBean("emp");
        Emp obj = context.getBean("emp",Emp.class);
        System.out.println(obj);
	}

}
