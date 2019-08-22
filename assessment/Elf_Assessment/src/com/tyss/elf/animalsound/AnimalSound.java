package com.tyss.elf.animalsound;

import lombok.extern.java.Log;
/*
 * 1.WAP to print sound of an animal based on the object received by the method.
 */
@Log
public class AnimalSound {

	public static void main(String[] args) {

		Sounds sound = new Sounds();
		String s = "cow";
		sound.sound(s);

	}
}