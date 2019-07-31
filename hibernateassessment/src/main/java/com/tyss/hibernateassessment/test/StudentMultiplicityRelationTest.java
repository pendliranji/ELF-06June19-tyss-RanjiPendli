package com.tyss.hibernateassessment.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tyss.hibernateassessment.bean.StudentInfoBean;
import com.tyss.hibernateassessment.bean.StudentOtherInfoBean;
import com.tyss.hibernateassessment.util.SessionFactoryUtil;

public class StudentMultiplicityRelationTest {

	public static void main(String[] args) {

		try (SessionFactory sessionFactory = SessionFactoryUtil.getSesfact()) {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();

			StudentInfoBean bean = new StudentInfoBean();
			bean.setRollNum(123);
			bean.setAge(24);
			bean.setEmailId("ranji.p@gmail.com");
			bean.setGender("MAle");
			bean.setMobileNo(8008677691L);
			bean.setName("ranji");

			StudentOtherInfoBean other = new StudentOtherInfoBean();
			other.setFatherName("mahi");
			other.setMotherName("neelu");
			other.setNationality("Indian");
			other.setReligion("hindu");

			bean.setInfo(other);
			session.save(bean);
			transaction.commit();

		}

	}

}
