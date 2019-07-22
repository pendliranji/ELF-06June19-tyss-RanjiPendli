package com.tyss.hibernateoperations.aws;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateForAws {

	public static void main(String[] args) {

		try (SessionFactory sf = SessionFactoryUtil.getSesfact()) {

			Session ses = sf.openSession();

			System.out.println("success :" + ses);

			ses.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
