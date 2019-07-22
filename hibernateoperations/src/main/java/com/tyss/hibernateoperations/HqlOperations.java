package com.tyss.hibernateoperations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.tyss.hibernateoperations.bean.EmployeeInfoBean;

public class HqlOperations {

	public static void main(String[] args) {

		try (SessionFactory sf = SessionFactoryUtil.getSesfact()) {

			Session ses = sf.openSession();
			String hql = "from EmployeeInfoBean";
			Query<EmployeeInfoBean> q = ses.createQuery(hql);
			List<EmployeeInfoBean> list = q.list();
			System.out.println("listv :" + list);
			List<EmployeeInfoBean> list1 = q.getResultList();
			System.out.println("list111 :" + list1);
			ses.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
