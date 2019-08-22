package com.tyss.elf.validatetemperature;

import java.util.Scanner;
import java.util.function.Consumer;

import lombok.extern.java.Log;

@Log
public class TemperatureValidation {

	public static void main(String[] args) {

		Consumer<Integer> consumer = temp -> {
			if (temp > 18)
				try {
					throw new OverTemperatureException();
				} catch (Exception e) {
					log.info("Temperature is not finefine");
				}

			else {
				log.info("Temperature is fine");

			}

		};
		Scanner scanner = new Scanner(System.in);
		log.info("ENter temperature");
		int temp = scanner.nextInt();
		consumer.accept(temp);

	}
}
