package com.tyss.hibernateoperations;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tyss.hibernateoperations.bean.EmployeeEducationalInfoBean;
import com.tyss.hibernateoperations.bean.EmployeeInfoBean;

public class AppTestThree {
	public static void main(String[] args) {

		try (Session ses = SessionFactoryUtil.getSesfact().openSession()) {
			Transaction tx = ses.beginTransaction();

			EmployeeInfoBean eb3 = new EmployeeInfoBean();
			eb3.setId(555);
			eb3.setMngrId(13);
			eb3.setAccountNumber(123456);
			eb3.setAge(25);
			eb3.setDesignation("hr ma");
			eb3.setDob(java.sql.Date.valueOf("1995-12-06"));
			eb3.setEmail("ranji.p@gmail.com");
			eb3.setGender("male");
			eb3.setJoiningDate(java.sql.Date.valueOf("2019-05-13"));
			eb3.setSalary(1523.9);
			eb3.setPhone(123456);
			eb3.setName("ranjith pendli");

			EmployeeEducationalInfoBean e = new EmployeeEducationalInfoBean();
			e.setId(5);
			e.setBranch("ECE");
			e.setCollegeName("Vathsalya");
			e.setDegreeType("B.Tech");
			e.setPercentage(75.6);
			e.setYop("2016");
			e.setUniversity("JNTUH");
			e.setEducationType("FullTime");
			e.setEi(eb3);

			EmployeeEducationalInfoBean e2 = new EmployeeEducationalInfoBean();
			e2.setId(6);
			e2.setBranch("ECE");
			e2.setCollegeName("Vathsalya");
			e2.setDegreeType("B.Tech");
			e2.setPercentage(75.6);
			e2.setYop("2016");
			e2.setUniversity("JNTUH");
			e2.setEducationType("part_time");
			e.setEi(eb3);

			

			ses.save(e);
			ses.save(e2);
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
