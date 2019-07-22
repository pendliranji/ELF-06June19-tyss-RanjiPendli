package com.tyss.hibernateoperations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class HqlOperationsExTwo {

	public static void main(String[] args) {
		try (SessionFactory sf = SessionFactoryUtil.getSesfact()) {
			Session ses = sf.openSession();
			Transaction tx = ses.beginTransaction();

			Query q = ses.createQuery("delete from EmployeeInfoBean where id=:a");

			q.setParameter("a", 211);
			int count = q.executeUpdate();
			System.out.println(count);
			tx.commit();

			String hql = "select name from EmployeeInfoBean";
			Query q1 = ses.createQuery(hql);
			List<String> list = q1.list();
			for (String name : list) {
				System.out.println(name);
			}

			ses.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
