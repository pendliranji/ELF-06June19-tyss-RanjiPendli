package com.tyss.hibernateassessment.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.tyss.hibernateassessment.bean.ProductBean;
import com.tyss.hibernateassessment.util.SessionFactoryUtil;

public class ProductTest {

	public static void main(String[] args) {

		try (SessionFactory sessionFactory = SessionFactoryUtil.getSesfact()) {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();

			ProductBean bean = new ProductBean();
			bean.setColor("red");
			bean.setPrice(1200.00);
			bean.setProductName("bmw");
			bean.setWeight(25.00);
			//session.save(bean);
			transaction.commit();
			
			//condition -1
			
			Criteria cr=session.createCriteria(ProductBean.class).add(Restrictions.lt("price", 100.00)).add(Restrictions.like("productName", "A%"));
			List<ProductBean> product11=cr.list();
			for(ProductBean pb:product11) {
				System.out.println(pb);
			}
			
			
			
			
			
		}

	}

}
