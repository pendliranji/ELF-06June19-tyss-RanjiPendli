package com.covalense.empspringmvc.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "employee_info")
@Entity
@Data
public class EmployeeInfoBean implements Serializable {
//	@OneToOne(cascade = CascadeType.ALL, mappedBy = "bean")
//	private EmployeeOtherInfoBean otherInfo;
//	
//	@OneToMany(cascade = CascadeType.ALL,mappedBy="addressPKBean.infoBean")
//	private List<EmployeeAddressInfoBean> add;
//	
//	@OneToMany(mappedBy = "employeeEducationPKBean.infoBean", cascade = CascadeType.ALL)
//	private List<EmployeeEducationalInfoBean> edu;
//
//	@OneToMany(mappedBy = "employeeExperiencePKBean.infoBean", cascade = CascadeType.ALL)
//	private List<EmployeeExperienceInfoBean> exp;
//	
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "gender")
	private String gender;
	@Column(name = "salary")
	private double salary;
	@Column(name = "phone")
	private int phone;
	@Column(name = "joining_date")
	private Date joiningDate;
	@Column(name = "Account_Number")
	private int accountNumber;
	@Column(name = "Email")
	private String email;
	@Column(name = "Designation")
	private String designation;
	@Column(name = "DOB")
	private Date dob;
	@Column(name = "dept_id")
	private int departmentId;
	
//	@ManyToOne
//	@JoinColumn(name = "DEPTARTMENT_ID", referencedColumnName = "DEPT_ID")
//	private DepartmentInfoBean departmentInfoBean;

//	@JoinColumn(name = "mngr_id", referencedColumnName = "ID")
//	@ManyToOne
//	private EmployeeInfoBean managerId;
	
	

		@Column(name = "password")
	private String password;

}
