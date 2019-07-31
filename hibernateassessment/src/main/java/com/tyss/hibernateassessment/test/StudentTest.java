package com.tyss.hibernateassessment.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.query.Query;

import com.tyss.hibernateassessment.bean.StudentBean;
import com.tyss.hibernateassessment.util.SessionFactoryUtil;

public class StudentTest {
	public static void main(String[] args) {

		try (SessionFactory sessionFactory = SessionFactoryUtil.getSesfact()) {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();

			StudentBean stu = new StudentBean();
			stu.setFirstName("sari");
			stu.setLastName("bujji");
			stu.setSubject("maths");
			stu.setTotalMarks(500);

			// session.save(stu);
			transaction.commit();

			Criteria cr = session.createCriteria(StudentBean.class).setProjection(Projections.projectionList()
					.add(Projections.property("firstName")).add(Projections.property("totalMarks")));
			List<Object[]> product11 = cr.list();
			for (Object[] pb : product11) {
				System.out.println("Name is :" + pb[0] + "  Marks are :" + pb[1]);
			}
			
			
			
			//question -6
			
			Query q=session.createQuery("from StudentBean where subject=:a and rollNum=:b");
			q.setParameter("a", "maths");
			q.setParameter("b", 5);
			StudentBean bean=(StudentBean) q.uniqueResult();
			System.out.println("Student Bean is :"+bean);

			
			
			//question-7
			Query q1=session.createQuery("select avg(totalMarks),max(totalMarks),min(totalMarks) from StudentBean ");
			
			List<Object[]> list = q1.list();
			for (Object[] pb : list) {
				System.out.println("avg :" + pb[0] + "  max marks :" + pb[1]+"  Min marks : "+pb[2]);
			}
			
			
		}

	}

}
