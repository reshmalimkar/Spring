package com.springFirstApp.ref;

public class A {
	private int a;
	private B obj;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public B getObj() {
		return obj;
	}
	public void setObj(B obj) {
		this.obj = obj;
	}
	public A(int a, B obj) {
		super();
		this.a = a;
		this.obj = obj;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

}
