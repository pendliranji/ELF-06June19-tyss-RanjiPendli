package com.app.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Item;
import com.app.service.IItemService;

@RestController
@RequestMapping("/rest/item")
public class ItemRestController {
	
	@Autowired
	private IItemService service;
	@GetMapping("/all")
	public ResponseEntity<?> getAll()
	{
	ResponseEntity<?> message=null;
	List<Item> itm=service.getAllItems();
	
	if(itm==null ||itm.isEmpty())
	{
		message=new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	else
	{
		message=new ResponseEntity<List<Item>>(itm,HttpStatus.OK);
		
	}
	
		return message;
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<?> getOne(@PathVariable Integer id)
	{
		ResponseEntity<?> message=null;
		
		Item it=service.getOneItemById(id);

		if(it==null)
		{
			message=new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		else
		{
			message=new ResponseEntity<Item>(it,HttpStatus.OK);
			
		}
		
		return message;
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id)
	{
		ResponseEntity<String> message=null;
		
		try
		{
			service.deleteItem(id);
			message=new ResponseEntity<String>("item deleted successfully",HttpStatus.OK);
		}catch (Exception e) {
			message=new ResponseEntity<String>("item id not found ",HttpStatus.BAD_REQUEST);

		}
		return message;
	}

}
