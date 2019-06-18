/**
 * 
 */
package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IPurchaseOrderDao;
import com.app.model.PurchaseOrder;
import com.app.service.IPurchaseOrderService;

/**
 * @author RAMESH JAKKULA
 *
 */
@Service
public class PurchaseOrderServiceImpl implements IPurchaseOrderService {

	@Autowired
	private IPurchaseOrderDao dao;
	@Transactional
	public Integer savePurchasseOrder(PurchaseOrder p) {
		return dao.savePurchasseOrder(p);
	}

	@Transactional
	public void updatePurchaseOrder(PurchaseOrder p) {
		dao.updatePurchaseOrder(p);
	}

	@Transactional
	public void deletePurchaseOrder(Integer id) {
		dao.deletePurchaseOrder(id);
	}

	
	@Transactional(readOnly=true)
	public PurchaseOrder getOnePurchaseOrderById(Integer id) {
		return dao.getOnePurchaseOrderById(id);
	}

	@Transactional(readOnly=true)
	public List<PurchaseOrder> getAllPurchaseOrder() {
		return dao.getAllPurchaseOrder();
	}

	

}
