package com.tyss.hibernateoperations.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeOthersInfoBean {
	private int id;
	private String panNumber;
	private boolean isMarried;
	private boolean isChallenged;
	private String bloodGroup;
	private String emergencyContactName;
	private int emergencyContactNumber;
	private String nationality;
	private String religion;
	private String fathersName;
	private String mothersName;
	private String spouseName;
	private String passport;
	private long aadhar;
}
