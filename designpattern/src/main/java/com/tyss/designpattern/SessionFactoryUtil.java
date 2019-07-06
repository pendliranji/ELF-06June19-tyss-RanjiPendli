
package com.tyss.designpattern;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {

	private static SessionFactory sf;

	private SessionFactoryUtil() {
	}

	private static SessionFactory getSesfact() {

		if (sf == null) {
			sf = new Configuration().configure().buildSessionFactory();
		}
		return sf;
	}

	public static Session openSession() {

		return getSesfact().openSession();

	}

}
