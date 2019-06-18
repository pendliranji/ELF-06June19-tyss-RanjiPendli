package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IVendorDao;
import com.app.model.Vendor;
@Repository
public class VendorDaoImpl implements IVendorDao {

	@Autowired
	private HibernateTemplate ht;
	@Override
	public Integer saveVendors(Vendor v) {
		return (Integer) ht.save(v);
	}

	@Override
	public void updateVendors(Vendor v) {
		ht.update(v);
	}

	@Override
	public void deleteVendors(Integer id) {

		Vendor v=new Vendor();
		v.setVenId(id);
		ht.delete(v);
	}

	@Override
	public Vendor getOneVendorById(Integer id) {
		return ht.get(Vendor.class, id);
	}

	@Override
	public List<Vendor> getAllVendors() {
		return ht.loadAll(Vendor.class);
	}

}
