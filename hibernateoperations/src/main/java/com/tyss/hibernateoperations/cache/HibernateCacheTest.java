package com.tyss.hibernateoperations.cache;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class HibernateCacheTest {

	public static void main(String[] args) {

		Session session = new Configuration().configure("com/tyss/hibernateoperations/cache/hibernate.cfg.xml")
				.buildSessionFactory().openSession();

		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, 1);
		System.out.println(bean);
		EmployeeInfoBean bean1 = session.get(EmployeeInfoBean.class, 1);
		System.out.println(bean1);

		EmployeeInfoBean bean2 = session.get(EmployeeInfoBean.class, 1);
		System.out.println(bean2);
		session.close();

	}
}
