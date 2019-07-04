package com.tyss.hibernateoperations.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "department_info")
public class DepartmentInfoBean {
	@Id
	@Column(name = "dept_id")
	private int deptId;
	@Column(name = "dept_name")
	private String deptName;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "dept_id")
	private List<EmployeeInfoBean> empInfo;

}
