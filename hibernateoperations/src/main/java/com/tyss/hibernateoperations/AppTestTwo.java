package com.tyss.hibernateoperations;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tyss.hibernateoperations.bean.EmployeeEducationalInfoBean;

public class AppTestTwo {
	public static void main(String[] args) {

		try (Session ses = SessionFactoryUtil.getSesfact().openSession()) {
			Transaction tx = ses.beginTransaction();

			EmployeeEducationalInfoBean e = new EmployeeEducationalInfoBean();
			e.setId(1);
			e.setBranch("ECE");
			e.setCollegeName("Vathsalya");
			e.setDegreeType("B.Tech");
			e.setPercentage(75.6);
			e.setYop("2016");
			e.setUniversity("JNTUH");
			e.setEducationType("FullTime");
			ses.save(e);
			tx.commit();
			ses.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
