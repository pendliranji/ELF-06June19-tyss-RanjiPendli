package com.tyss.designpattern;

import com.tyss.designpattern.dao.EmployeeDAO;
import com.tyss.designpattern.dao.EmployeeDAOHibernateImpl;
import com.tyss.designpattern.dao.EmployeeDAOJDBCImpl;

public class EmployeeDAOFactory {

	private EmployeeDAOFactory() {
	}

	public static EmployeeDAO getDAOInstance(String s) {
		if (s.contains("hibernate")) {
			return new EmployeeDAOHibernateImpl();
		} else if (s.contains("jdbc")) {
			return new EmployeeDAOJDBCImpl();
		} else {
			return null;
		}
	}

}
