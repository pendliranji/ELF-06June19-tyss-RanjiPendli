package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUserTypeDao;
import com.app.model.WhUserType;
import com.app.service.IUserTypeService;
@Service
public class UserTypeServiceImpl implements IUserTypeService {

	@Autowired
	private IUserTypeDao dao;
	@Transactional
	public Integer userTypeInsert(WhUserType u) {
		return dao.userTypeInsert(u);
	}

	@Transactional
	public void userTypeUpdate(WhUserType u) {

		dao.userTypeUpdate(u);
	}

	@Transactional
	public void userTypeDelete(Integer id) {

		dao.userTypeDelete(id);
	}

	@Transactional(readOnly=true)
	public WhUserType getOneUserType(Integer id) {
		return dao.getOneUserType(id);
	}

	@Transactional(readOnly=true)
	public List<WhUserType> getAllUserTypes() {
		return dao.getAllUserTypes();
	}

	@Transactional(readOnly=true)
	public List<WhUserType> getUserTypeByType(String type) {
		// TODO Auto-generated method stub
		return dao.getUserTypeByType(type);
	}

	@Transactional(readOnly=true)
	public boolean isUserTypeEmailExist(String mail) {
		return dao.isUserTypeEmailExist(mail);
	}

	@Transactional(readOnly=true)
	public boolean isUserCustConnectedWithItem(Integer id) {
		return dao.isUserCustConnectedWithItem(id);
	}

	
}
