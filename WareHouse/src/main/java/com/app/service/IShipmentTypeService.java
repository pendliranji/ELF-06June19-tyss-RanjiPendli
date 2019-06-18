package com.app.service;

import java.util.List;

import com.app.model.ShipmentType;

public interface IShipmentTypeService {


	public Integer shipmentTypeInsert(ShipmentType u);
	public void shipmentTypeUpdate(ShipmentType u);
	public void shipmentTypeDelete(Integer id);
	public ShipmentType getOneShipmentType(Integer id);
	public List<ShipmentType> getAllShipmentTypes();
	public List<ShipmentType> getAllShipmentsTypesByEnbled(String e);


}
