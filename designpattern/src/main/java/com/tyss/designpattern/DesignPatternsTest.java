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

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("db.properties");
		Properties p = new Properties();
		p.load(fis);
		EmployeeDAO dao = EmployeeDAOFactory.getDAOInstance(p.getProperty("dbInteractionType"));
		printData(dao.getEmployeeInfo("2"));
		printData(dao.getEmployeeInfo(12));

		System.out.println("********* Employee records: *************");
		List<EmployeeInfoBean> listOfBeans = dao.getAllEmployeeInfo();
		for (EmployeeInfoBean bean : listOfBeans) {
			printData(bean);
		}
	}
}
