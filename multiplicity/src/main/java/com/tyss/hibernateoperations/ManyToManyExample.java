package com.tyss.hibernateoperations;

import java.util.Arrays;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tyss.hibernateoperations.bean.EmployeeInfoBean;
import com.tyss.hibernateoperations.bean.TrainingInfoBean;
import com.tyss.util.SessionFactoryUtil;

public class ManyToManyExample {
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
			bean.setName("ranji");
			bean.setMngrId(bean);
			bean.setPhone(8008677691l);
			
			EmployeeInfoBean bean1 = new EmployeeInfoBean();
			bean1.setAccountNumber(11111111);
			bean1.setAge(24);
			bean1.setDesignation("# dev");
			bean1.setDeptId(111);
			bean1.setSalary(24365.2);
			bean1.setDob(new Date());
			bean1.setEmail("raji.pendl@gmailcom");
			bean1.setGender("male");
			bean1.setJoiningDate(new Date());
			bean1.setMngrId(bean);
			
			bean1.setName("bujji");
			bean1.setPhone(8008677691l);

			EmployeeInfoBean bean2 = new EmployeeInfoBean();
			bean2.setAccountNumber(11111111);
			bean2.setAge(24);
			bean2.setDesignation("# dev");
			bean2.setDeptId(111);
			bean2.setSalary(24365.2);
			bean2.setDob(new Date());
			bean2.setEmail("raji.pendl@gmailcom");
			bean2.setGender("male");
			bean2.setJoiningDate(new Date());
			bean2.setMngrId(bean1);
			bean2.setName("pendli");
			bean2.setPhone(8008677691l);
			
			TrainingInfoBean tBean=new TrainingInfoBean();

			tBean.setCourseType("full");
			tBean.setCourseName("java");
			tBean.setDuration("6 months");
			tBean.setEmployeeInfoBeans(Arrays.asList(bean2,bean1,bean));

			TrainingInfoBean tBean1=new TrainingInfoBean();
			tBean1.setCourseType("part");
			tBean1.setCourseName("AI");
			tBean1.setDuration("3 months");
			tBean1.setEmployeeInfoBeans(Arrays.asList(bean2,bean1,bean));


			ses.save(tBean);
			ses.save(tBean1);

			tx.commit();
		}
	}

}
