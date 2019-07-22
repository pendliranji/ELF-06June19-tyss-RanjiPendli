package com.tyss.hibernateoperations;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CallProceduresFromdb {

	public static void main(String[] args) {
		try (SessionFactory sf = SessionFactoryUtil.getSesfact()) {
			Session ses = sf.openSession();

			StoredProcedureQuery spq = ses.createStoredProcedureCall("employee_info");

			boolean bo = spq.execute();
			System.out.println(bo);

			List<Object[]> i = spq.getResultList();
			for (Object[] eb : i) {
				for (int j = 0; j < i.size(); j++) {
					System.out.println(eb[j]);
				}
				System.out.println("--------------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
