package com.tyss.hibernateoperations.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrainingInfoBean {
	private int id;
	private String courseName;
	private String duration;
}
