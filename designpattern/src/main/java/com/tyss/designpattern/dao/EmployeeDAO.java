package com.tyss.designpattern.dao;

import java.util.List;

import com.tyss.designpattern.bean.EmployeeInfoBean;

public interface EmployeeDAO {

	EmployeeInfoBean getEmployeeInfo(String id);

	EmployeeInfoBean getEmployeeInfo(int id);

	List<EmployeeInfoBean> getAllEmployeeInfo();

	/* int insertEmployee(EmployeeInfoBean bean); */
	/* int updateEmployee(EmployeeInfoBean bean); */
	/* void deleteEmployee(Integer id); */

}
