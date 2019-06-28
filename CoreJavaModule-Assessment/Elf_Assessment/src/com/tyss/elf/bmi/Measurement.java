package com.tyss.elf.bmi;

import lombok.extern.java.Log;

@Log
public class Measurement {
	private String name;
	private double height;
	private double weight;

	public Measurement(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public static java.util.logging.Logger getLog() {
		return log;
	}

}
