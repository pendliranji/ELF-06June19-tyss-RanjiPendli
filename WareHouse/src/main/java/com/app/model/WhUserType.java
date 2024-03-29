package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="whuser")
public class WhUserType {
	@Id
	@GeneratedValue(generator="user_gen")
	@GenericGenerator(name="user_gen",strategy="increment")
	@Column(name="wid")
	private Integer id;
	@Column(name="wtype")
	private String type;
	@Column(name="wcode")
	private String code;
	@Column(name="wfortype")
	private String forType;
	@Column(name="wmail")
	private String email;
	@Column(name="wcontact")
	private String contact;
	@Column(name="widtype")
	private String idType;
	@Column(name="wother")
	private String ifOther;
	@Column(name="wnum")
	private String idNum;
	
	public WhUserType() {
		super();
	}

	public WhUserType(Integer id) {
		super();
		this.id = id;
	}

	public WhUserType(Integer id, String type, String code, String forType, String email, String contact, String idType,
			String ifOther, String idNum) {
		super();
		this.id = id;
		this.type = type;
		this.code = code;
		this.forType = forType;
		this.email = email;
		this.contact = contact;
		this.idType = idType;
		this.ifOther = ifOther;
		this.idNum = idNum;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getForType() {
		return forType;
	}

	public void setForType(String forType) {
		this.forType = forType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIfOther() {
		return ifOther;
	}

	public void setIfOther(String ifOther) {
		this.ifOther = ifOther;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	@Override
	public String toString() {
		return "WhUserType [id=" + id + ", type=" + type + ", code=" + code + ", forType=" + forType + ", email="
				+ email + ", contact=" + contact + ", idType=" + idType + ", ifOther=" + ifOther + ", idNum=" + idNum
				+ "]";
	}

	
	
	
	
}
