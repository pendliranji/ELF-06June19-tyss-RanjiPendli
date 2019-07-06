package com.tyss.hibernateoperations;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;


import com.tyss.hibernateoperations.bean.EmployeeInfoBean;

public class App {
	public static void main(String[] args) {

		try (Session ses = SessionFactoryUtil.getSesfact().openSession()) {
			Transaction ts = ses.beginTransaction();
			System.out.println("1111111-" + SessionFactoryUtil.getSesfact());
			System.out.println("2222222-" + SessionFactoryUtil.getSesfact());
			System.out.println("33333333-" + SessionFactoryUtil.getSesfact());

			EmployeeInfoBean eb = new EmployeeInfoBean();
			eb.setId(1111);
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

			// ses.save(d);
			ses.saveOrUpdate(eb);
			ts.commit();
			/*
			 * EmployeeInfoBean eib = ses.get(EmployeeInfoBean.class, 1);
			 * System.out.println(eib);
			 */
			// using Hql Query
			Query q = ses.createQuery("from EmployeeInfoBean");
			List<EmployeeInfoBean> list = q.list();
			System.out.println(list);
			for (EmployeeInfoBean ebb : list) {
				System.out.println(list);
			}
			// Using Crieria
			Criteria criteria = ses.createCriteria(EmployeeInfoBean.class).add(Restrictions.eq("id", 2)).setProjection(
					Projections.projectionList().add(Projections.property("name")).add(Projections.property("email")));

			List<Object[]> ob = criteria.list();
			System.out.println("criteria :" + ob);
			for (Object[] ebb : ob) {
				System.out.println(ebb[0] + "---" + ebb[1]);
			}
			ses.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
