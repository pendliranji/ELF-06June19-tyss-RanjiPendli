package com.app.service;

import java.util.List;

import com.app.model.OrderMethod;

public interface IOrderMethodService {

	public Integer saveOrders(OrderMethod or);
	public void updateOrders(OrderMethod or);
	public void deleteOrders(Integer id);
	public OrderMethod getOneOrderById(Integer id);
	public List<OrderMethod> getAllOrders();
	
	public List<OrderMethod> getOrderMethodByMode(String mode);
	public boolean isOrderConnectedWithItem(Integer id);
	public boolean isOrderPurchaseConnectedWithItem(Integer id);
}
