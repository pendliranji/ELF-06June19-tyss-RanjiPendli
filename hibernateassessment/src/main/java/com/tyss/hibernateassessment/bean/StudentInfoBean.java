package com.tyss.hibernateassessment.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Student_info")
public class StudentInfoBean {
	@Id
	@GeneratedValue
	private int rollNum;
	private String name;
	private int age;
	private String gender;
	private Long mobileNo;
	private String emailId;
	@OneToOne(targetEntity = StudentOtherInfoBean.class, cascade = CascadeType.ALL)
	private StudentOtherInfoBean info;

}
