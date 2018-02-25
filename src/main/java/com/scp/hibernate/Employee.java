package com.scp.hibernate;

public class Employee {
	int id;
	String ename;
	public Employee(int id, String ename) {
		super();
		this.id = id;
		this.ename = ename;
	}
	public String getEname() {
		return ename;
	}
	public int getId() {
		return id;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", ename=" + ename + "]";
	}
	
	
	
	
	

}
