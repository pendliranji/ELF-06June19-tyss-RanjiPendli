package com.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class AssessmentEx {

	public static void main(String[] args) {
		Random rand = new Random();
		Map<String, Integer[][]> map = new HashMap<>();
		Integer[][] iob=null;

		for (int j = 0; j < 5; j++) {
			for (int k = 0; k < 5; k++) {
				iob = new Integer[5][rand.nextInt(50)];

			}
		}

		for (int i = 0; i < 5; i++) {
			map.put("ranji", iob);
		}

		for (int i = 0; i < map.size(); i++) {
			System.out.println(map.keySet());
			System.out.println(map.values());
		}
	}

}
