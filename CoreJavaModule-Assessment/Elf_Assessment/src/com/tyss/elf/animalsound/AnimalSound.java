package com.tyss.elf.animalsound;

import lombok.extern.java.Log;

@Log
public class AnimalSound {

	public static void main(String[] args) {

		Sounds sound = new Sounds();
		String s = "cow";
		sound.sound(s);

	}
}