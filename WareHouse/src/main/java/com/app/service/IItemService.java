package com.app.service;

import java.util.List;

import com.app.model.Item;
import com.app.model.OrderMethod;

public interface IItemService {

	public Integer saveItem(Item i);
	public List<Item> getAllItems();
	public void deleteItem(Integer id);
	public void updateItem(Item i);
	public Item getOneItemById(Integer id);
	

}
