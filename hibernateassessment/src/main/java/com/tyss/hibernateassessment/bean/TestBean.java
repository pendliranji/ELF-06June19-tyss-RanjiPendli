package com.tyss.hibernateassessment.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "test")
public class TestBean implements Serializable {
	@Id
	@GeneratedValue
	private int id;
	private String firstName;
	private String lastName;
	private String city;
}
