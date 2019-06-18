package com.app.dao;

import java.util.List;

import com.app.model.PurchaseOrder;

public interface IPurchaseOrderDao {

	public Integer savePurchasseOrder(PurchaseOrder p);
	public void updatePurchaseOrder(PurchaseOrder p);
	public void deletePurchaseOrder(Integer id);
	
	public PurchaseOrder getOnePurchaseOrderById(Integer id);
	public List<PurchaseOrder> getAllPurchaseOrder();
	
	
	
}
