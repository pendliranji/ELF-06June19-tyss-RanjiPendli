package com.tyss.designpattern.builder;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class EmployeeData3 {
	private int id;
	private String name;
	private int age;
	private String email;
	private String gender;
	private double salary;

}