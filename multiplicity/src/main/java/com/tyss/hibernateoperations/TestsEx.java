package com.tyss.hibernateoperations;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tyss.hibernateoperations.bean.Address;
import com.tyss.util.SessionFactoryUtil;

public class TestsEx {

	public static void main(String[] args) {
		
		try (SessionFactory sf = SessionFactoryUtil.getSesfact()) {
			Session ses = sf.openSession();
			Transaction tx = ses.beginTransaction();

			Address ad=new Address();
			ad.setAddress1("dddddddddddddddddd");

			ses.save(ad);

			tx.commit();
		}
	}
}
