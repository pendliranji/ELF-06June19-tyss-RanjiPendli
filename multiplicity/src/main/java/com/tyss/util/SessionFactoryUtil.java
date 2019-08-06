package com.tyss.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {

	private static SessionFactory sf ;

	private SessionFactoryUtil() {
	}

	public static SessionFactory getSesfact() {
		
		if (sf == null) {
			sf = new Configuration().configure().buildSessionFactory();
		}
		return sf;
	}

}
