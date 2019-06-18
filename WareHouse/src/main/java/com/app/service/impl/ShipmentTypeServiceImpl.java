package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IShipmentTypeDao;
import com.app.model.ShipmentType;
import com.app.service.IShipmentTypeService;
@Service
public class ShipmentTypeServiceImpl implements IShipmentTypeService {

	@Autowired
	private IShipmentTypeDao dao;
	
	@Transactional
	public Integer shipmentTypeInsert(ShipmentType u) {
		return dao.shipmentTypeInsert(u);
	}

	@Transactional
	public void shipmentTypeUpdate(ShipmentType u) {

		dao.shipmentTypeUpdate(u);
	}

	@Transactional
	public void shipmentTypeDelete(Integer id) {

		dao.shipmentTypeDelete(id);
	}

	@Transactional(readOnly=true)
	public ShipmentType getOneShipmentType(Integer id) {
		return dao.getOneShipmentType(id);
	}

	@Transactional(readOnly=true)
	public List<ShipmentType> getAllShipmentTypes() {
		return dao.getAllShipmentTypes();
	}

	@Transactional(readOnly=true)
	public List<ShipmentType> getAllShipmentsTypesByEnbled(String e) {
		// TODO Auto-generated method stub
		return dao.getAllShipmentsTypesByEnbled(e);
	}

}
