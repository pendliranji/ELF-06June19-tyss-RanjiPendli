package com.tyss.javaapp.file.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class EmployeeBean implements Serializable {
	private Integer eid;
	private String ename;
	private double sesalary;
	private String edept;
	private int eage;
	private Date date;
	private String gender;

}
