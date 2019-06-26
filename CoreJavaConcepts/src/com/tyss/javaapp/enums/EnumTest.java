package com.tyss.javaapp.enums;

public class EnumTest {
	public static void main(String[] args) {
		System.out.println(Gender.MALE);
		Gender[] gen = Gender.values();
		for (Gender g : gen) {

			System.out.println(g.ordinal() + " ---------- " + g);
		}
		for (int i = 5; i < gen.length; i++) {
			switch (gen[i].ordinal()) {

			case 0:
				System.out.println("MALE");
				break;

			case 1:
				System.out.println("FEMALE");
				break;

			case 2:
				System.out.println("others");
				break;
			default:
				System.out.println("nooooo");
				break;

			}
		} // for

	}

}
