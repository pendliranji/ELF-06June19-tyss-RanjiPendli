package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="shipment_type")
public class ShipmentType {

	@Id
	@GeneratedValue(generator="ship_gen")
	@GenericGenerator(name="ship_gen",strategy="increment")	
	@Column(name="sid")
	private Integer id;
	@Column(name="smode")
	private String mode;
	@Column(name="scode")
	private String code;
	@Column(name="senable")
	private String enabled;
	@Column(name="sdsc")
	private String dsc;
	@Column(name="sgrade")
	private String grade;
	public ShipmentType() {
		super();
	}
	public ShipmentType(Integer id) {
		super();
		this.id = id;
	}
	public ShipmentType(Integer id, String mode, String code, String enabled, String dssc, String grade) {
		super();
		this.id = id;
		this.mode = mode;
		this.code = code;
		this.enabled = enabled;
		this.dsc = dsc;
		this.grade = grade;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getEnabled() {
		return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	public String getDsc() {
		return dsc;
	}
	public void setDsc(String dsc) {
		this.dsc = dsc;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "ShipmentType [id=" + id + ", mode=" + mode + ", code=" + code + ", enabled=" + enabled + ", desc="
				+ dsc + ", grade=" + grade + "]";
	}
	
	
	
	
}
