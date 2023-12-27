package com.springcore.springFirstApp.Collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	private int empId;
	private List<String> phones;
	private Set<String> address;
	private Map<String ,String>courcess;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourcess() {
		return courcess;
	}
	public void setCourcess(Map<String, String> courcess) {
		this.courcess = courcess;
	}
	public Emp(int empId, List<String> phones, Set<String> address, Map<String, String> courcess) {
		super();
		this.empId = empId;
		this.phones = phones;
		this.address = address;
		this.courcess = courcess;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", phones=" + phones + ", address=" + address + ", courcess=" + courcess + "]";
	}
	

}
