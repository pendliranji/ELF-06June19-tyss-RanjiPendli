package com.tyss.hibernateassessment.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="product_tab")
@Data
@NoArgsConstructor
public class ProductBean {
	@Id
	@GeneratedValue
	private int productId;
	private String productName;
	private String color;
	private double price;
	private double weight;
	

}
