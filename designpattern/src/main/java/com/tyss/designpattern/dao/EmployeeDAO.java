package com.tyss.designpattern.dao;

import java.util.List;

import com.tyss.designpattern.bean.EmployeeInfoBean;

public interface EmployeeDAO {

	EmployeeInfoBean getEmployeeInfo(String id);

	EmployeeInfoBean getEmployeeInfo(int id);

	List<EmployeeInfoBean> getAllEmployeeInfo();

	boolean saveEmployeeInfo(EmployeeInfoBean bean);

	boolean updateEmployeeInfo(EmployeeInfoBean bean);

	boolean deleteEmployeeInfo(int id);

	boolean deleteEmployeeInfo(String id);

}
