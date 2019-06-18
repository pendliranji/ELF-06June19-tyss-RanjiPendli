package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IVendorDao;
import com.app.model.Vendor;
import com.app.service.IVendorService;
@Service
public class VendorServiceImpl implements IVendorService {

	@Autowired
	private IVendorDao dao;
	
	@Transactional
	public Integer saveVendors(Vendor v) {
		// TODO Auto-generated method stub
		return dao.saveVendors(v);
	}

	@Transactional
	public void updateVendors(Vendor v) {

		dao.updateVendors(v);
	}

	@Transactional
	public void deleteVendors(Integer id) {

		dao.deleteVendors(id);
	}

	@Transactional(readOnly=true)
	public Vendor getOneVendorById(Integer id) {
		return dao.getOneVendorById(id);
	}

	@Transactional(readOnly=true)
	public List<Vendor> getAllVendors() {
		return dao.getAllVendors();
	}

}
