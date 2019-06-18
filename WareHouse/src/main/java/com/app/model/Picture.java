package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="picture_tab")
public class Picture {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int pId;
	@Column(name="name")
	private String pName;
	@Column(name="dating")
	private String pDate;
	public Picture() {
		super();
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpDate() {
		return pDate;
	}
	public void setpDate(String pDate) {
		this.pDate = pDate;
	}
	@Override
	public String toString() {
		return "Picture [pId=" + pId + ", pName=" + pName + ", pDate=" + pDate + "]";
	}



}
