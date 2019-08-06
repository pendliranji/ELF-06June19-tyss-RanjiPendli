package com.tyss.hibernateoperations;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tyss.hibernateoperations.bean.EmployeeInfoBean;
import com.tyss.hibernateoperations.bean.EmployeeOthersInfoBean;
import com.tyss.util.SessionFactoryUtil;

public class Multiplicity {

	public static void main(String[] args) {
		try (SessionFactory sf = SessionFactoryUtil.getSesfact()) {
			Session ses = sf.openSession();
			Transaction tx = ses.beginTransaction();

			EmployeeInfoBean bean = new EmployeeInfoBean();
			bean.setAccountNumber(11111111);
			bean.setAge(24);
			bean.setDesignation("java dev");
			bean.setDeptId(111);
			bean.setSalary(24365.2);
			bean.setDob(new Date());
			bean.setEmail("raji.pendl@gmailcom");
			bean.setGender("male");
			bean.setJoiningDate(new Date());
			bean.setMngrId(bean);
			bean.setName("ranji");
			bean.setPhone(8008677691l);

			EmployeeOthersInfoBean other = new EmployeeOthersInfoBean();

			other.setAadhar(769523992401l);
			other.setBloodGroup("o+");
			other.setChallenged(false);
			other.setEmergencyContactNumber(8143999267l);
			other.setEmergencyContactName("pendli");
			other.setFathersName("Mahender");
			other.setMarried(false);
			other.setMothersName("Neelu");
			other.setNationality("Indian");
			other.setPanNumber("Dkjpp2803j");
			other.setPassport("N8330227");
			other.setReligion("Hindu");
			other.setSpouseName("------");
			other.setBean(bean);

			ses.save(bean);
			ses.save(other);
			tx.commit();

			// for getting through Parent

			Query q = ses.createQuery("from EmployeeInfoBean");
			List<EmployeeInfoBean> info = q.list();
			for (EmployeeInfoBean b : info) {
				System.out.println(b);
			}

			Query q1 = ses.createQuery("from EmployeeOthersInfoBean");
			List<EmployeeOthersInfoBean> otherInfo = q1.list();
			for (EmployeeOthersInfoBean b1 : otherInfo) {
				System.out.println(" child :" + b1);
			}

		}

	}
}
