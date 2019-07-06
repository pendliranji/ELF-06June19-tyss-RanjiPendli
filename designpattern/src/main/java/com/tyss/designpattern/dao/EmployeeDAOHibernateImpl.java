package com.tyss.designpattern.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

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

		try (Session ses = SessionFactoryUtil.openSession()) {
			return ses.get(EmployeeInfoBean.class, id);
		} catch (Exception e) {
			return null;
		}
	}// end of method-2

	public List<EmployeeInfoBean> getAllEmployeeInfo() {
		try (Session ses = SessionFactoryUtil.openSession()) {
			return ses.createQuery("from EmployeeInfoBean").list();
		} catch (Exception e) {
			return new ArrayList<>();
		} // end of method-3
	}

	@Override
	public boolean saveEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdateEmployeeInfo(bean);
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdateEmployeeInfo(bean);
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		Transaction tx =null;
		EmployeeInfoBean bean = new EmployeeInfoBean();
		bean.setId(id);
		try (Session ses = SessionFactoryUtil.openSession()) {
			tx = ses.beginTransaction();
			ses.delete(bean);
			tx.commit();
			return true;
		} catch (NullPointerException e) {
			e.printStackTrace();
			tx.rollback();
			return false;
		}
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		return deleteEmployeeInfo(Integer.parseInt(id));
	}

	private boolean saveOrUpdateEmployeeInfo(EmployeeInfoBean bean) {
		Transaction tx = null;
		try (Session ses = SessionFactoryUtil.openSession()) {
			tx = ses.beginTransaction();
			ses.saveOrUpdate(bean);
			tx.commit();
			return true;
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			return false;
		}
	}

}
