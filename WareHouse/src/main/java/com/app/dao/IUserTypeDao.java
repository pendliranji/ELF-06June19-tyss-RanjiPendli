package com.app.dao;

import java.util.List;

import com.app.model.Uom;
import com.app.model.WhUserType;

public interface IUserTypeDao {
	

	public Integer userTypeInsert(WhUserType u);
	public void userTypeUpdate(WhUserType u);
	public void userTypeDelete(Integer id);
	public WhUserType getOneUserType(Integer id);
	public List<WhUserType> getAllUserTypes();
	
	public List<WhUserType> getUserTypeByType(String type);
	public boolean isUserTypeEmailExist(String mail);
	public boolean isUserCustConnectedWithItem(Integer id);

}
