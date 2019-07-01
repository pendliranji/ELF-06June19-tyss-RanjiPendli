package com.tyss.myjavaapplication;

import com.tyss.filecreationutil.bean.EmployeeInfoBean;
import com.tyss.filecreationutil.util.CreateFileUtil;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		CreateFileUtil fileUtil = new CreateFileUtil();
		fileUtil.createFile("sanjay.txt", "hello ranji !!!");
		EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
		employeeInfoBean.setEmail("ranji");
		System.out.println(" " + employeeInfoBean.getEmail());

	}
}
