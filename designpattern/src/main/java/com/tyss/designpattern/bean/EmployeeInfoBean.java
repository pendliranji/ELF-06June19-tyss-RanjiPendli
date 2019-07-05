package com.tyss.designpattern.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee_info")
public class EmployeeInfoBean {
	@Id
	private int id;
	@Column(name = "name")
	private String name;
	private int age;
	private String email;
	private String gender;
	private double salary;
	private long phone;
	@Column(name = "joining_date")
	private Date joiningDate;
	private String designation;
	private Date dob;
	@Column(name = "account_number")
	private long accountNumber;

	private int deptId;
	@Column(name = "mngr_id")
	private int mngrId;
}