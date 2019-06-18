package com.app.service;

import java.util.List;

import com.app.model.PurchaseOrder;

public interface IPurchaseOrderService {
	public Integer savePurchasseOrder(PurchaseOrder p);
	public void updatePurchaseOrder(PurchaseOrder p);
	public void deletePurchaseOrder(Integer id);
	
	public PurchaseOrder getOnePurchaseOrderById(Integer id);
	public List<PurchaseOrder> getAllPurchaseOrder();
	

	
}
