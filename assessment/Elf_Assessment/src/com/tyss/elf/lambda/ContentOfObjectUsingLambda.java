package com.tyss.elf.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

import lombok.extern.java.Log;

/*
 *15. WAP to display the content of object using lambda expression


 * */
@Log
public class ContentOfObjectUsingLambda {

	public static void main(String[] args) {

		EmployeeBean emp1 = new EmployeeBean(1, "ranji", 23.5);

		EmployeeBean emp2 = new EmployeeBean(2, "ranji2", 58.5);
		EmployeeBean emp3 = new EmployeeBean(3, "ranji3", 85.9);
		EmployeeBean emp4 = new EmployeeBean(4, "ranji4", 8.2);

		log.info("---------EMPLOYEE DETAILS------");
		Consumer<EmployeeBean> empBean = employee -> {

			log.info("Id :" + employee.getEmpId());
			log.info("Name :" + employee.getEmpName());
			log.info("Salary :" + employee.getEmpSalary());

			log.info("-------------------------------");
		};

		ArrayList<EmployeeBean> al = new ArrayList<>();
		al.add(emp2);
		al.add(emp3);
		
		empBean.accept(emp1);
	}

}
