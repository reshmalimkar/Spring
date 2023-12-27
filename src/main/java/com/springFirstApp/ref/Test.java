package com.springFirstApp.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springFirstApp/ref/refconfig.xml");
		A temp=(A)context.getBean("aref");
		//System.out.println(temp.geta());
		//System.out.println(temp.getY().getob());
		System.out.println(temp);
	}

}
