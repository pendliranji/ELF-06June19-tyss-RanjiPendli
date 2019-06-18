package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IOrderMethodDao;
import com.app.model.OrderMethod;
import com.app.service.IOrderMethodService;
@Service
public class OrderMethodServiceImpl implements IOrderMethodService {

	@Autowired
	private IOrderMethodDao dao;
	@Transactional
	public Integer saveOrders(OrderMethod or) {
		return dao.saveOrders(or);
	}

	@Transactional
	public void updateOrders(OrderMethod or) {

		dao.updateOrders(or);
	}

	@Transactional
	public void deleteOrders(Integer id) {

		dao.deleteOrders(id);
	}

	@Transactional(readOnly=true)
	public OrderMethod getOneOrderById(Integer id) {
		return dao.getOneOrderById(id);
	}

	@Transactional(readOnly=true)
	public List<OrderMethod> getAllOrders() {
		return dao.getAllOrders();
	}

	
	

	@Transactional(readOnly=true)
	public List<OrderMethod> getOrderMethodByMode(String mode) {
		// TODO Auto-generated method stub
		return dao.getOrderMethodByMode(mode);
	}

	@Transactional(readOnly=true)
	public boolean isOrderConnectedWithItem(Integer id) {
		return dao.isOrderConnectedWithItem(id);
	}

	@Transactional(readOnly=true)
	public boolean isOrderPurchaseConnectedWithItem(Integer id) {
		// TODO Auto-generated method stub
		return dao.isOrderPurchaseConnectedWithItem(id);
	}
	
}
