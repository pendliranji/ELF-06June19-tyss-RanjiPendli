		package com.tyss.hibernateoperations.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeAddressInfoBean {

	private int id;
	private String addressType;
	private String addressOne;
	private String addressTwo;
	private String landmark;
	private String city;
	private String state;
	private String country;
	private int pincode;
}
