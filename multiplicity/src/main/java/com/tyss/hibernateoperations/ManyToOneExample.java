package com.tyss.hibernateoperations;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tyss.hibernateoperations.bean.EmployeeAddressInfoBean;
import com.tyss.hibernateoperations.bean.EmployeeAddressPKBean;
import com.tyss.hibernateoperations.bean.EmployeeEducationPKBean;
import com.tyss.hibernateoperations.bean.EmployeeEducationalInfoBean;
import com.tyss.hibernateoperations.bean.EmployeeExperienceInfoBean;
import com.tyss.hibernateoperations.bean.EmployeeExperiencePKBean;
import com.tyss.hibernateoperations.bean.EmployeeInfoBean;
import com.tyss.hibernateoperations.bean.EmployeeOthersInfoBean;
import com.tyss.util.SessionFactoryUtil;

public class ManyToOneExample {
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
		//	bean.setMngrId(123);
			bean.setName("ranji");
			bean.setPhone(8008677691l);

			EmployeeOthersInfoBean other = new EmployeeOthersInfoBean();

			other.setAadhar(769523992401l);
			other.setBloodGroup("o+");
			other.setChallenged(false);
			other.setEmergencyContactNumber(8143999267l);
			other.setEmergencyContactName("pendli");
			other.setFathersName("Mahender");
			other.setMarried(false);
			other.setMothersName("Neelu");
			other.setNationality("Indian");
			other.setPanNumber("Dkjpp2803j");
			other.setPassport("N8330227");
			other.setReligion("Hindu");
			other.setSpouseName("------");
			other.setBean(bean);

			EmployeeAddressPKBean pk = new EmployeeAddressPKBean();
			pk.setAddressType("p");
			pk.setInfoBean(bean);

			EmployeeAddressInfoBean add = new EmployeeAddressInfoBean();
			add.setAddressOne("111111");
			add.setAddressTwo("222222");

			add.setCity("banglr");
			add.setCountry("ind");
			add.setLandmark("tyss");
			add.setPincode(506391);
			add.setState("karnataka");
			add.setAddressPKBean(pk);

			EmployeeAddressPKBean pk1 = new EmployeeAddressPKBean();
			pk1.setAddressType("temporary");
			pk1.setInfoBean(bean);

			EmployeeAddressInfoBean add1 = new EmployeeAddressInfoBean();
			add1.setAddressOne("111111");
			add1.setAddressTwo("222222");
			add1.setCity("hyd");
			add1.setCountry("ind");
			add1.setLandmark("tyss");
			add1.setPincode(506391);
			add1.setState("telanagana");
			add1.setAddressPKBean(pk1);

			EmployeeEducationPKBean bean2 = new EmployeeEducationPKBean();
			bean2.setInfoBean(bean);
			bean2.setEducationType("fulltime");

			EmployeeEducationalInfoBean edu = new EmployeeEducationalInfoBean();
			edu.setBranch("ECE");
			edu.setCollegeName("jntuh");
			edu.setDegreeType("b.tecjh");
			edu.setPercentage(76.5);
			edu.setUniversity("jntuh");
			edu.setYop("2016");
			edu.setEmployeeEducationPKBean(bean2);

			EmployeeEducationPKBean bean3 = new EmployeeEducationPKBean();
			bean3.setInfoBean(bean);
			bean3.setEducationType("part-time");

			EmployeeEducationalInfoBean edu1 = new EmployeeEducationalInfoBean();
			edu1.setBranch("ECE");
			edu1.setCollegeName("jntuh");
			edu1.setDegreeType("b.tecjh");
			edu1.setPercentage(76.5);
			edu1.setUniversity("jntuh");
			edu1.setYop("2016");
			edu1.setEmployeeEducationPKBean(bean3);

			EmployeeExperiencePKBean expPKBean = new EmployeeExperiencePKBean();
			expPKBean.setCompanyName("tysss");
			expPKBean.setInfoBean(bean);

			EmployeeExperienceInfoBean expBean = new EmployeeExperienceInfoBean();
			expBean.setDesignation("dev");
			expBean.setJoiningDate(new Date());
			expBean.setLeavingDate(new Date());
			expBean.setEmployeeExperiencePKBean(expPKBean);

			EmployeeExperiencePKBean expPKBean1 = new EmployeeExperiencePKBean();
			expPKBean1.setCompanyName("viscad");
			expPKBean1.setInfoBean(bean);
			EmployeeExperienceInfoBean expBean1 = new EmployeeExperienceInfoBean();
			expBean1.setDesignation("dev");
			expBean1.setJoiningDate(new SimpleDateFormat("yyyyMMdd").parse("20190805"));
			expBean1.setLeavingDate(new Date());
			expBean1.setEmployeeExperiencePKBean(expPKBean1);

			ses.save(bean);
			ses.save(other);
			ses.save(add);
			ses.save(add1);
			ses.save(edu);
			ses.save(edu1);
			ses.save(expBean);
			ses.save(expBean1);
			tx.commit();

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
