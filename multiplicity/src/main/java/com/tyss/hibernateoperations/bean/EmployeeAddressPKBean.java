package com.tyss.hibernateoperations.bean;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
@Data
@Embeddable
public class EmployeeAddressPKBean implements Serializable {
	
	@JoinColumn(name="ID")
	@ManyToOne
	private EmployeeInfoBean infoBean;
	
	private String addressType;

}
