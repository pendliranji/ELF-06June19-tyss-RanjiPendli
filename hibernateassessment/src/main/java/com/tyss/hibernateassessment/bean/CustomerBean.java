package com.tyss.hibernateassessment.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="customer_tab")
public class CustomerBean {
	@Id
	@GeneratedValue
	private int id;
	private String firstName;
	private String lastName;

	private Long contactNumber;
	private String address;
	private String 	city;
	private String state;
	private String country;
	
	
}
