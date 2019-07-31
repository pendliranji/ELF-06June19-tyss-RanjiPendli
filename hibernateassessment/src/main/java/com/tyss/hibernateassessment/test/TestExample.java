package com.tyss.hibernateassessment.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tyss.hibernateassessment.bean.CustomerBean;
import com.tyss.hibernateassessment.util.SessionFactoryUtil;

public class TestExample {

	public static void main(String[] args) {

		try (SessionFactory sessionFactory = SessionFactoryUtil.getSesfact()) {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			String hql = "INSERT INTO TestBean(firstName, lastName, city)   SELECT firstName, lastName, city FROM CustomerBean";
			Query query2 = session.createQuery(hql);

			int count = query2.executeUpdate();
			transaction.commit();
			System.out.println("inserted successfully:" + count);

		}

	}

}
