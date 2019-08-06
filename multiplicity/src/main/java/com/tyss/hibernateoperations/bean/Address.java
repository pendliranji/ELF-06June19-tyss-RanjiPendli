package com.tyss.hibernateoperations.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name = "address_tab")
@Data
public class Address {

	@Id
	@GenericGenerator(name = "sequence_dep_id", strategy = "com.tyss.hibernateoperations.CustomGenerator")
	@GeneratedValue(generator = "sequence_dep_id")
	private String addId;

	private String address1;

}
  