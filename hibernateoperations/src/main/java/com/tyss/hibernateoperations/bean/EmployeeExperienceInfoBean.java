package com.tyss.hibernateoperations.bean;

import java.util.Date;

import javax.transaction.Transactional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Transactional
public class EmployeeExperienceInfoBean {
	private int id;
	private String companyName;
	private String designation;
	private Date joiningDate;
	private Date leavingDate;
}
