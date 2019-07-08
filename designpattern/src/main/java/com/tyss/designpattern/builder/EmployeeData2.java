package com.tyss.designpattern.builder;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class EmployeeData2 {
	private int id;
	private String name;
	private int age;

	private EmployeeData2(EmployeeData2Builder builder) {
		id = builder.id;
		name = builder.name;
		age = builder.age;
	}

	public static class EmployeeData2Builder {

		private int id;
		private String name;
		private int age;

		public EmployeeData2Builder id(int id) {
			this.id = id;
			return this;

		}

		public EmployeeData2Builder name(String name) {
			this.name = name;
			return this;
		}

		public EmployeeData2Builder age(int age) {
			this.age = age;
			return this;
		}

		public EmployeeData2 build() {
			return new EmployeeData2(this);
		}

	}
}