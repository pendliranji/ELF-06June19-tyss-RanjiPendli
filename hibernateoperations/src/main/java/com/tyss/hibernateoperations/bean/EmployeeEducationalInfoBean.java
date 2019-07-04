package com.tyss.hibernateoperations.bean;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

	@Id
	@Column(name = "")
	private int id;
	@Id
	@Column(name = "education_type")
	private String educationType;
	@Column(name = "college_nm")
	private String collegeName;
	private String university;
	private String yop;
	@Column(name = "degree_type")
	private String degreeType;
	private String branch;
	private double percentage;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="emp_id")
	private EmployeeInfoBean ei;

}
