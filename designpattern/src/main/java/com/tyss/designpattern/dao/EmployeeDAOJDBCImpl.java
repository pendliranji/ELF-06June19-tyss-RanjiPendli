package com.tyss.designpattern.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.tyss.designpattern.bean.EmployeeInfoBean;

public class EmployeeDAOJDBCImpl implements EmployeeDAO {

	public List<EmployeeInfoBean> getAllEmployeeInfo() {

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss_db", "root", "root");) {

			PreparedStatement st = con.prepareStatement("select * from employee_info");
			ResultSet result = st.executeQuery();
			ArrayList<EmployeeInfoBean> al = new ArrayList<>();

			while (result.next()) {
				EmployeeInfoBean bean = new EmployeeInfoBean();
				bean.setAge(result.getInt(3));
				bean.setId(result.getInt(1));
				bean.setName(result.getString(2));
				bean.setEmail(result.getString(4));
				bean.setGender(result.getString(5));
				bean.setSalary(result.getDouble(6));
				bean.setPhone(result.getInt(7));
				bean.setJoiningDate(result.getDate(8));
				bean.setDesignation(result.getString(9));
				bean.setDob(result.getDate(10));
				bean.setAccountNumber(result.getInt(11));
				bean.setDeptId(result.getInt(12));
				bean.setMngrId(result.getInt(13));
				al.add(bean);
			} // while ending
			return al;
		} catch (Exception e) {
			return new ArrayList<>();
		}
	}// end method-1

	public EmployeeInfoBean getEmployeeInfo(String args) {
		try {
			if (Integer.parseInt(args) > 0)
				return getEmployeeInfo(Integer.parseInt(args));

			else {
				System.out.println("please enter gt Zero vals :");
				return null;
			}
		} catch (NumberFormatException nfe) {
			System.out.println("please enter greater aero vals :" + nfe);
			return null;
		}

	}// end of getEmpInfo(String a)

	public EmployeeInfoBean getEmployeeInfo(int id) {
		ResultSet result = null;
		EmployeeInfoBean bean = new EmployeeInfoBean();
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss_db", "root", "root");) {
			PreparedStatement st = con.prepareStatement("select * from employee_info where id=?");
			st.setInt(1, id);
			result = st.executeQuery();
			while (result.next()) {
				bean.setAge(result.getInt(3));
				bean.setId(result.getInt(1));
				bean.setName(result.getString(2));
				bean.setEmail(result.getString(4));
				bean.setGender(result.getString(5));
				bean.setSalary(result.getDouble(6));
				bean.setPhone(result.getInt(7));
				bean.setJoiningDate(result.getDate(8));
				bean.setDesignation(result.getString(9));
				bean.setDob(result.getDate(10));
				bean.setAccountNumber(result.getInt(11));
				bean.setDeptId(result.getInt(12));
				bean.setMngrId(result.getInt(13));
			}
		} catch (Exception e1) {
			bean = null;
			e1.printStackTrace();
		}
		return bean;

	}

	@Override
	public boolean saveEmployeeInfo(EmployeeInfoBean bean) {
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}
}
