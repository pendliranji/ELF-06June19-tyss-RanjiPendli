package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="pur_ord_tab")
public class PurchaseOrder {

	@Id
	@GeneratedValue(generator="pur_gen")
	@GenericGenerator(name="pur_gen",strategy="increment")
	@Column(name="pid")
	private Integer id;
	@Column(name="pcode")
	private String code;
	@Column(name="pnum")
	private String num;
	@Column(name="pcheck")
	private String check;
	@Column(name="pstatus")
	private String status;
	@Column(name="pdsc")
	private String dsc;

	@ManyToOne
	@JoinColumn(name="shipId_Fk")
	private ShipmentType ship;


	@ManyToOne
	@JoinColumn(name="fkuserId")
	private WhUserType typeUser;


	public PurchaseOrder() {
		super();
	}
	public PurchaseOrder(Integer id) {
		super();
		this.id = id;
	}
	public PurchaseOrder(Integer id, String code, String num, String check, String status, String dsc,
			ShipmentType ship, WhUserType typeUser) {
		super();
		this.id = id;
		this.code = code;
		this.num = num;
		this.check = check;
		this.status = status;
		this.dsc = dsc;
		this.ship = ship;
		this.typeUser = typeUser;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getCheck() {
		return check;
	}
	public void setCheck(String check) {
		this.check = check;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDsc() {
		return dsc;
	}
	public void setDsc(String dsc) {
		this.dsc = dsc;
	}
	public ShipmentType getShip() {
		return ship;
	}
	public void setShip(ShipmentType ship) {
		this.ship = ship;
	}
	public WhUserType getTypeUser() {
		return typeUser;
	}
	public void setTypeUser(WhUserType typeUser) {
		this.typeUser = typeUser;
	}
	@Override
	public String toString() {
		return "PurchaseOrder [id=" + id + ", code=" + code + ", num=" + num + ", check=" + check + ", status=" + status
				+ ", dsc=" + dsc + ", ship=" + ship + ", typeUser=" + typeUser + "]";
	}




}
