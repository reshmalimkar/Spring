package com.springFirstApp.LifeCycle;

import javax.annotation.PostConstruct;

public class Example {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Example() {
		super();
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	@PostConstruct
	public void start() {
		System.out.println("starting method");
	}
	public void end() {
		System.out.println("ending method");
	}
}
