package com.tyss.designpattern.builder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class EmployeeData {
	private int id;
	private String name;
	private int age;
	private String email;
	private String gender;
	private double salary;

}