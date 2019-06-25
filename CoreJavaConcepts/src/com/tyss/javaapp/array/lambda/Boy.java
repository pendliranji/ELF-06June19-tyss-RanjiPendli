package com.tyss.javaapp.array.lambda;

import lombok.Data;

@Data
public class Boy {
	String name;
	int height;
	int age;
	public Boy(String name, int height, int age) {
		super();
		this.name = name;
		this.height = height;
		this.age = age;
	}
	
	
}
