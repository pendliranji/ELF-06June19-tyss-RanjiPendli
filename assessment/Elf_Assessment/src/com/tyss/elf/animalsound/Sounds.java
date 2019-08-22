package com.tyss.elf.animalsound;

import lombok.extern.java.Log;

@Log
public class Sounds implements Animal {
	@Override
	public void sound(String sound) {
		if (sound.contentEquals("cow")) {
			log.info("ambaa");
		} else if(sound.contentEquals("dog")){
			log.info("bow");
		}else
		{
			log.info("other");
		}

	}
}
