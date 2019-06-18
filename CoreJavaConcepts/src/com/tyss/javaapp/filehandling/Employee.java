package com.tyss.javaapp.filehandling;

import java.io.Serializable;

public class Employee implements Serializable{

	//public Long serialVersionUID =  506318592107968629;
	transient int id;
	 String name;
	public Employee() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	

}
