package com.tyss.hibernateassessment.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "stud_tab")
@Data
public class StudentBean {
	@Id
	@GeneratedValue
	private int rollNum;
	private String firstName;
	private String lastName;
	private String subject;
	private double totalMarks;

}
