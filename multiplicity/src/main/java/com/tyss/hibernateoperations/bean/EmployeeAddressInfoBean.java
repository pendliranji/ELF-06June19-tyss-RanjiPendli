package com.tyss.hibernateoperations.bean;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employee_addressinfo")
public class EmployeeAddressInfoBean implements Serializable {

	
	@EmbeddedId
	private EmployeeAddressPKBean addressPKBean;
	
	private String addressOne;
	private String addressTwo;
	private String landmark;
	private String city;
	private String state;
	private String country;
	private int pincode;
}
