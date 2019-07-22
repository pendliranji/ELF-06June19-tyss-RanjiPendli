package com.tyss.hibernateoperations.cache;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class HibernateCacheTest2 {

	public static EmployeeInfoBean getEmp(int id) {
		Session session = new Configuration().configure("com/tyss/hibernateoperations/cache/hibernate.cfg.xml")
				.buildSessionFactory().openSession();

		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);

		session.close();
		return bean;
	}

	public static void main(String[] args) {

		System.out.println("1-"+getEmp(1));
		System.out.println("2"+getEmp(1));
		System.out.println("3"+getEmp(1));
	}
}
