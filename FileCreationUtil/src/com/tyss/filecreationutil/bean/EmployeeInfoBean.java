package com.tyss.filecreationutil.bean;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeInfoBean {

	private int id;
	private String name;
	private String email;
	private long phone;
	private Date joinDate;
	private double salary;

}
