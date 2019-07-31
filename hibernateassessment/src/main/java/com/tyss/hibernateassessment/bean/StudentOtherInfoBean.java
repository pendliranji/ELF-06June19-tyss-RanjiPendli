package com.tyss.hibernateassessment.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Student_Otherinfo")
public class StudentOtherInfoBean {

	@Id
	@GeneratedValue
	private int rollNum;
	private String fatherName;
	private String motherName;
	private String religion;
	private String nationality;

}
