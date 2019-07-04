package com.tyss.hibernateoperations;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tyss.hibernateoperations.bean.TrainingInfoBean;

public class AppTestFive {
	public static void main(String[] args) {

		try (Session ses = SessionFactoryUtil.getSesfact().openSession()) {
			Transaction tx = ses.beginTransaction();

			TrainingInfoBean ei = new TrainingInfoBean();
			ei.setId(1);
			ei.setDuration("6 months");
			ei.setCourseName("java");
			ses.save(ei);
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
