package com.tyss.hibernateoperations;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tyss.hibernateoperations.bean.DepartmentInfoBean;
import com.tyss.hibernateoperations.bean.EmployeeInfoBean;

public class AppTestOne {

	public static void main(String[] args) {

		try (Session ses = SessionFactoryUtil.getSesfact().openSession()) {
			Transaction tx = ses.beginTransaction();

			EmployeeInfoBean eb = new EmployeeInfoBean();
			eb.setId(19);
			eb.setDeptId(1);
			eb.setMngrId(13);
			eb.setAccountNumber(123456);
			eb.setAge(25);
			eb.setDesignation("hr ma");
			eb.setDob(java.sql.Date.valueOf("1995-12-06"));
			eb.setEmail("ranji.p@gmail.com");
			eb.setGender("male");
			eb.setJoiningDate(java.sql.Date.valueOf("2019-05-13"));
			eb.setSalary(1523.9);
			eb.setPhone(123456);
			eb.setName("ranjith pendli");

			EmployeeInfoBean eb2 = new EmployeeInfoBean();
			eb2.setId(222);
			eb2.setMngrId(13);
			eb2.setAccountNumber(123456);
			eb2.setAge(25);
			eb2.setDesignation("hr ma");
			eb2.setDob(java.sql.Date.valueOf("1995-12-06"));
			eb2.setEmail("ranji.p@gmail.com");
			eb2.setGender("male");
			eb2.setJoiningDate(java.sql.Date.valueOf("2019-05-13"));
			eb2.setSalary(1523.9);
			eb2.setPhone(123456);
			eb2.setName("ranjith pendli");

			EmployeeInfoBean eb3 = new EmployeeInfoBean();
			eb3.setId(333);
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

			ArrayList<EmployeeInfoBean> al = new ArrayList<>();
			al.add(eb);
			al.add(eb2);
			al.add(eb3);

			DepartmentInfoBean d = new DepartmentInfoBean();
			d.setDeptId(11);
			d.setDeptName("development");
			d.setEmpInfo(al);
			ses.save(d);
			tx.commit();
			ses.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
