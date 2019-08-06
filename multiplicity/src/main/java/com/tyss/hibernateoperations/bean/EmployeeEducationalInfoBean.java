package com.tyss.hibernateoperations.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee_educationalinf")
public class EmployeeEducationalInfoBean implements Serializable{

	@EmbeddedId
	private EmployeeEducationPKBean employeeEducationPKBean;
	
	@Column(name = "college_nm")
	private String collegeName;
	private String university;
	private String yop;
	@Column(name = "degree_type")
	private String degreeType;
	private String branch;
	private double percentage;

}
