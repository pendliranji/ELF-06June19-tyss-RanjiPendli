package com.tyss.hibernateoperations.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="training_info")
public class TrainingInfoBean {
	@Id
	@GeneratedValue
	private int courseId;
	private String courseName;
	private String duration;
	private String courseType;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="EMPLOYEE_TRAINING_INF",joinColumns =@JoinColumn(name="COURSEID") ,inverseJoinColumns =@JoinColumn(name="ID") )
	private List<EmployeeInfoBean> employeeInfoBeans;
}












