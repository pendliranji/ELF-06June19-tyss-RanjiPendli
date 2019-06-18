package com.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.model.PurchaseOrder;
import com.app.model.WhUserType;
@Repository
public class PurchaseOrderDaoImpl implements IPurchaseOrderDao {

	@Autowired
	private HibernateTemplate ht;

	public Integer savePurchasseOrder(PurchaseOrder p) {
		return (Integer) ht.save(p);
	}

	public void updatePurchaseOrder(PurchaseOrder p) {
		ht.update(p);
	}

	public void deletePurchaseOrder(Integer id) {
		ht.delete(new PurchaseOrder(id));

	}

	public PurchaseOrder getOnePurchaseOrderById(Integer id) {
		return ht.get(PurchaseOrder.class, id);
	}

	public List<PurchaseOrder> getAllPurchaseOrder() {
		return ht.loadAll(PurchaseOrder.class);
	}



}
