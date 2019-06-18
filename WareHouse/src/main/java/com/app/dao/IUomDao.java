package com.app.dao;

import java.util.List;

import com.app.model.Uom;

public interface IUomDao {
	
	public Integer UomInsert(Uom u);
	public void UomUpdate(Uom u);
	public void UomDelete(Integer id);
	public Uom getOneUom(Integer id);
	public List<Uom> getAllUoms();
	public boolean isUomModelExist(String model);
	public boolean isUomConnectedWithItem(Integer id);
	
}
