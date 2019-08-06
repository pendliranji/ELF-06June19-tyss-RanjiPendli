package com.tyss.hibernateoperations.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee_otherInfo")
public class EmployeeOthersInfoBean implements Serializable{
	@Id
	@OneToOne
	@JoinColumn(name = "ID")
	//@PrimaryKeyJoinColumn(name="ID")
	//	either this singleannotation or above  to refer as primary and foreign key relation
	private EmployeeInfoBean bean;
	private String panNumber;
	private boolean isMarried;
	private boolean isChallenged;
	private String bloodGroup;
	private String emergencyContactName;
	private long emergencyContactNumber;
	private String nationality;
	private String religion;
	private String fathersName;
	private String mothersName;
	private String spouseName;
	private String passport;
	private long aadhar;
}
