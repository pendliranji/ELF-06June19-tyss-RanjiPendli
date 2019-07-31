package com.tyss.hibernateassessment.cache;

import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee_info")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
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
