package com.springFirstApp.LifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
	public static void main(String[] args) {
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/springFirstApp/LifeCycle/lcconfig.xml");
//		Samosa samosa=(Samosa)context.getBean("samosa");
//	    System.out.println(samosa);
	    //registering shut down hook
        context.registerShutdownHook();
//	    System.out.println("--------------------------------");
//	    Object bean = context.getBean("pepsi");
//	    System.out.println(bean);
        Example e1 = context.getBean("Ex1",Example.class);
	  // Example e1=(Example) context.getBean("Ex1");
	   System.out.println(e1);
	}

}
