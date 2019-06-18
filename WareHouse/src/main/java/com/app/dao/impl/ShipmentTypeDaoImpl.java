package com.app.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IShipmentTypeDao;
import com.app.model.ShipmentType;
@Repository
public class ShipmentTypeDaoImpl implements IShipmentTypeDao {

	@Autowired
	private HibernateTemplate ht;
	public Integer shipmentTypeInsert(ShipmentType u) {
		return (Integer) ht.save(u);
	}

	public void shipmentTypeUpdate(ShipmentType u) {

		ht.update(u);
	}

	public void shipmentTypeDelete(Integer id) {

		ShipmentType s=new ShipmentType();
		s.setId(id);
		ht.delete(s);
	}

	public ShipmentType getOneShipmentType(Integer id) {
		return ht.get(ShipmentType.class, id);
	}

	public List<ShipmentType> getAllShipmentTypes() {
		return ht.loadAll(ShipmentType.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ShipmentType> getAllShipmentsTypesByEnbled(String e) {
		
		//String hql="from "+ShipmentType.class.getName()+" where enabled=?";
		
		return (List<ShipmentType>) ht.findByCriteria(DetachedCriteria.forClass(ShipmentType.class).add(Restrictions.eq("enabled", e))
				
				);
	}

}
