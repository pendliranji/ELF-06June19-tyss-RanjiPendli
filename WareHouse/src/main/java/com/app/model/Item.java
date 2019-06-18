package com.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "item_tab")
public class Item {
	@Column(name = "id")
	@Id
	@GeneratedValue(generator="itm_gen")
	@GenericGenerator(name="itm_gen",strategy="increment")
	private Integer itId;
	@Column(name = "code")
	private String itCode;
	@Column(name = "cost")
	private Double itCost;
	@Column(name = "currrency")
	private String itCurrency;
	@Column(name="width")
	private Double itWidth;
	@Column(name="length")
	private Double itLength;
	@Column(name="height")
	private Double itHeight;

	@Column(name="it_dsc")
	private String itDsc;

	@ManyToOne
	@JoinColumn(name="uomIdFk")
	private Uom uomm;

	//sale type ---ordermethod

	@ManyToOne
	@JoinColumn(name="omSaleId")
	private OrderMethod saleType;


	//purchase type--ordermethod
	@ManyToOne
	@JoinColumn(name="omPurchaseType")
	private OrderMethod purchaseType;

	//vendor type--

	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="ven_item",joinColumns=@JoinColumn(name="itemId_fk"),inverseJoinColumns=@JoinColumn(name="venIdFk"))
	@Fetch(value=FetchMode.SUBSELECT)
	private List<WhUserType> venUsers=new ArrayList<WhUserType>(0);

	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="cust_item",joinColumns=@JoinColumn(name="itemId_fk"),inverseJoinColumns=@JoinColumn(name="CustIdFk"))
	@Fetch(value=FetchMode.SUBSELECT)
	private List<WhUserType> custUsers=new ArrayList<WhUserType>(0);





	public Item() {
		super();
	}
	public Item(Integer itId) {
		super();
		this.itId = itId;
	}
	public Item(Integer itId, String itCode, Double itCost, String itCurrency, Double itWidth, Double itLength,
			Double itHeight, String itDsc, Uom uomm, OrderMethod saleType, OrderMethod purchaseType,
			List<WhUserType> venUsers, List<WhUserType> custUsers) {
		super();
		this.itId = itId;
		this.itCode = itCode;
		this.itCost = itCost;
		this.itCurrency = itCurrency;
		this.itWidth = itWidth;
		this.itLength = itLength;
		this.itHeight = itHeight;
		this.itDsc = itDsc;
		this.uomm = uomm;
		this.saleType = saleType;
		this.purchaseType = purchaseType;
		this.venUsers = venUsers;
		this.custUsers = custUsers;
	}
	public Integer getItId() {
		return itId;
	}
	public void setItId(Integer itId) {
		this.itId = itId;
	}
	public String getItCode() {
		return itCode;
	}
	public void setItCode(String itCode) {
		this.itCode = itCode;
	}
	public Double getItCost() {
		return itCost;
	}
	public void setItCost(Double itCost) {
		this.itCost = itCost;
	}
	public String getItCurrency() {
		return itCurrency;
	}
	public void setItCurrency(String itCurrency) {
		this.itCurrency = itCurrency;
	}
	public Double getItWidth() {
		return itWidth;
	}
	public void setItWidth(Double itWidth) {
		this.itWidth = itWidth;
	}
	public Double getItLength() {
		return itLength;
	}
	public void setItLength(Double itLength) {
		this.itLength = itLength;
	}
	public Double getItHeight() {
		return itHeight;
	}
	public void setItHeight(Double itHeight) {
		this.itHeight = itHeight;
	}
	public String getItDsc() {
		return itDsc;
	}
	public void setItDsc(String itDsc) {
		this.itDsc = itDsc;
	}
	public Uom getUomm() {
		return uomm;
	}
	public void setUomm(Uom uomm) {
		this.uomm = uomm;
	}
	public OrderMethod getSaleType() {
		return saleType;
	}
	public void setSaleType(OrderMethod saleType) {
		this.saleType = saleType;
	}
	public OrderMethod getPurchaseType() {
		return purchaseType;
	}
	public void setPurchaseType(OrderMethod purchaseType) {
		this.purchaseType = purchaseType;
	}
	public List<WhUserType> getVenUsers() {
		return venUsers;
	}
	public void setVenUsers(List<WhUserType> venUsers) {
		this.venUsers = venUsers;
	}
	public List<WhUserType> getCustUsers() {
		return custUsers;
	}
	public void setCustUsers(List<WhUserType> custUsers) {
		this.custUsers = custUsers;
	}
	@Override
	public String toString() {
		return "Item [itId=" + itId + ", itCode=" + itCode + ", itCost=" + itCost + ", itCurrency=" + itCurrency
				+ ", itWidth=" + itWidth + ", itLength=" + itLength + ", itHeight=" + itHeight + ", itDsc=" + itDsc
				+ ", uomm=" + uomm + ", saleType=" + saleType + ", purchaseType=" + purchaseType + ", venUsers="
				+ venUsers + ", custUsers=" + custUsers + "]";
	}






}
