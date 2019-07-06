package com.tyss.designpattern;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import com.tyss.designpattern.bean.EmployeeInfoBean;
import com.tyss.designpattern.dao.EmployeeDAO;

public class DesignPatternsTest {
	private static void printData(EmployeeInfoBean bean) {
		System.out.println(bean + "");
	}

	private static EmployeeInfoBean insertEmpDetails() {
		EmployeeInfoBean employeeBean = new EmployeeInfoBean();
		employeeBean.setId(212);
		employeeBean.setDeptId(1);
		employeeBean.setMngrId(13);
		employeeBean.setAccountNumber(123456);
		employeeBean.setAge(25);
		employeeBean.setDesignation("hr ma");
		employeeBean.setDob(java.sql.Date.valueOf("1995-12-06"));
		employeeBean.setEmail("ranji.p@gmail.com");
		employeeBean.setGender("male");
		employeeBean.setJoiningDate(java.sql.Date.valueOf("2019-05-13"));
		employeeBean.setSalary(1523.9);
		employeeBean.setPhone(123456);
		employeeBean.setName("ranjith pendli");
		return employeeBean;
	}

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("db.properties");
		Properties p = new Properties();
		p.load(fis);
		EmployeeDAO dao = EmployeeDAOFactory.getDAOInstance(p.getProperty("dbInteractionType"));

		System.out.println("Employee Record Deleted ::**" + dao.deleteEmployeeInfo(1));

		printData(dao.getEmployeeInfo("2"));
		printData(dao.getEmployeeInfo(12));

		System.out.println("inserted ::*********" + dao.saveEmployeeInfo(DesignPatternsTest.insertEmpDetails()));

		System.out.println("********* Employee records: *************");
		List<EmployeeInfoBean> listOfBeans = dao.getAllEmployeeInfo();
		for (EmployeeInfoBean bean : listOfBeans) {
			printData(bean);
		}
	}
}
