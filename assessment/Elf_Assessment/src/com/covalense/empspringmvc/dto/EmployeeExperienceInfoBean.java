package com.covalense.empspringmvc.dto;

import java.io.Serializable;
import java.util.Date;

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
@Table(name="employee_experienceinfo")
public class EmployeeExperienceInfoBean implements Serializable {
	@EmbeddedId
	private EmployeeExperiencePKBean employeeExperiencePKBean;
	private String designation;
	private Date joiningDate;
	private Date leavingDate;
}
