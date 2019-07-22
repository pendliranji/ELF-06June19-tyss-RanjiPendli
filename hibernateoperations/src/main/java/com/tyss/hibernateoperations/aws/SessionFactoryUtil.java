package com.tyss.hibernateoperations.aws;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {

	private static SessionFactory sf ;

	private SessionFactoryUtil() {
	}

	public static SessionFactory getSesfact() {
		
		if (sf == null) {
			sf = new Configuration().configure("com/tyss/hibernateoperations/aws/hibernate.xml").buildSessionFactory();
		}
		return sf;
	}

}
