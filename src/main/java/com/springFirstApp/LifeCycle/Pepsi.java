package com.springFirstApp.LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean {
	private double price;
	public double getPrice() {
		return price;
	}
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public Pepsi() {
		super();
	}
	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("going to put bottle back to shop:destroy");
		
	}

}
