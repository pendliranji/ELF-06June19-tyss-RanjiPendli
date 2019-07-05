package com.tyss.designpattern.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import com.tyss.designpattern.SessionFactoryUtil;
import com.tyss.designpattern.bean.EmployeeInfoBean;

public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	public EmployeeInfoBean getEmployeeInfo(String id) {
		try {
			return getEmployeeInfo(Integer.parseInt(id));
		} catch (Exception e) {
			return null;
		}
	}// end of method-1

	public EmployeeInfoBean getEmployeeInfo(int id) {

		try (Session ses = SessionFactoryUtil.getSesfact().openSession()) {

			return ses.get(EmployeeInfoBean.class, id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}// end of method-2

	public List<EmployeeInfoBean> getAllEmployeeInfo() {
		try (Session ses = SessionFactoryUtil.getSesfact().openSession()) {
			return ses.createQuery("from EmployeeInfoBean").list();
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<>();
		} // end of method-3

	}

}
