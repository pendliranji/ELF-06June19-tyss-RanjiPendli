package com.tyss.hibernateoperations;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.tyss.hibernateoperations.bean.EmployeeInfoBean;

public class CriteriaExampleOne {

	public static void main(String[] args) {
		try (SessionFactory sf = SessionFactoryUtil.getSesfact()) {
			Session ses = sf.openSession();
//Using Restrictions
			Criteria cri = ses.createCriteria(EmployeeInfoBean.class, "emp").add(Restrictions.eq("id", 1))
					.add(Restrictions.eq("name", "ranji"));

			EmployeeInfoBean list = (EmployeeInfoBean) cri.uniqueResult();
			System.out.println(list);

			// Using Projections for single column
			Criteria cri1 = ses.createCriteria(EmployeeInfoBean.class, "emp")
					.setProjection((Projections.property("id")));
			List<Integer> lis = cri1.list();
			System.out.println(lis);

			// Using Projections for selecting multiple columns
			Criteria cri2 = ses.createCriteria(EmployeeInfoBean.class, "emp").setProjection(
					Projections.projectionList().add(Projections.property("id")).add(Projections.property("name")));

			List<Object[]> ob = cri2.list();
			System.out.println(ob);
			for (Object[] ob1 : ob) {
				System.out.println(ob1[0] + "-" + ob1[1]);
			}

			Criteria cri4 = ses.createCriteria(EmployeeInfoBean.class, "emp").setProjection(Projections.rowCount())
					.add(Restrictions.eq("name", "ranjith pendli"));
			List l = cri4.list();
			System.out.println("count :"+l);
			ses.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
