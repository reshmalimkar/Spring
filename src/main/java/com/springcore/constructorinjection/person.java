package com.springcore.constructorinjection;

public class person {
	private String Name;
	private int personId;
	public person(String Name,int personId) {
		this.Name=Name;
		this.personId=personId;
	}
	@Override
	public String toString() {
		return this.Name+" : "+this.personId;
	}

}
