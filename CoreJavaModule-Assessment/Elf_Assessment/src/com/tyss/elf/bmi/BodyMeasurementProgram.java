package com.tyss.elf.bmi;

import java.util.Scanner;
import java.util.function.Consumer;

import lombok.extern.java.Log;

@Log
public class BodyMeasurementProgram {

	public static void main(String[] args) {

		Consumer<Measurement> con = consumer -> {
			if (consumer.getWeight() / (consumer.getHeight() * consumer.getHeight()) > 39) {
				log.info(consumer.getName() + "\n");
				log.info("Your are of Over--Weight");
			} else {
				log.info(" " +consumer.getName() + "\n");
				log.info("Perfect measurements");
			}

		};
		Scanner scanner = new Scanner(System.in);
		log.info("ENter Name");
		String name = scanner.nextLine();
		log.info("ENter Height");
		double height = Double.parseDouble(scanner.nextLine());
		log.info("ENter weight");
		double weight = Double.parseDouble(scanner.nextLine());

		Measurement mes = new Measurement(name, height, weight);
		con.accept(mes);
	}

}
