package com.app.dao;

import java.util.List;

import com.app.model.OrderMethod;
import com.app.model.Vendor;

public interface IVendorDao {

	public Integer saveVendors(Vendor v);
	public void updateVendors(Vendor v);
	public void deleteVendors(Integer id);
	public Vendor getOneVendorById(Integer id);
	public List<Vendor> getAllVendors();

}
