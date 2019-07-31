package com.tyss.hibernateassessment.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tyss.hibernateassessment.bean.CustomerBean;
import com.tyss.hibernateassessment.util.SessionFactoryUtil;

public class CustomerTest {

	public static void main(String[] args) {

		try (SessionFactory sessionFactory = SessionFactoryUtil.getSesfact()) {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();

			CustomerBean bean = new CustomerBean();
			bean.setAddress("#1 circle");
			bean.setCity("bangalore");
			bean.setContactNumber(8008677691L);
			bean.setCountry("India");
			bean.setFirstName("Pneldi");
			bean.setLastName("ranjith");
			bean.setState("telanagana");
         //for Inserting and update
			// session.saveOrUpdate(bean);
			transaction.commit();
			// for Getting data
			Query query = session.createQuery("from CustomerBean");
			List<CustomerBean> customerBean = query.list();
			for (CustomerBean bean1 : customerBean) {
				System.out.println(bean1.toString());
			}
			
			
			
			//for deleteing
			Session session1 = sessionFactory.openSession();
			Transaction transaction1 = session.beginTransaction();
			
			Query query1 = session.createQuery("delete from CustomerBean where id=:a");
			query1.setParameter("a", 2);
			query1.executeUpdate();
			transaction1.commit();
			System.out.println("deleted successfully");
			
			
			
			

		}

	}

}
