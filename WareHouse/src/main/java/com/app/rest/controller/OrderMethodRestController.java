package com.app.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.OrderMethod;
import com.app.model.Uom;
import com.app.service.IOrderMethodService;

@RestController
@RequestMapping("/rest/order")
public class OrderMethodRestController {

	@Autowired
	private IOrderMethodService service;
	@GetMapping("all")
	public ResponseEntity<?> getAll()
	{
		ResponseEntity<?> message=null;

		List<OrderMethod> oms=service.getAllOrders();
		if(oms==null ||oms.isEmpty())
		{
			message=new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		else
		{
			message=new ResponseEntity<List<OrderMethod>>(oms,HttpStatus.OK);
		}
		return message;
	}
	@GetMapping("/get/{id}")
	public  ResponseEntity<?> getOne(@PathVariable("id")Integer id)
	{
		ResponseEntity<?> message=null;

		OrderMethod oms=service.getOneOrderById(id);
		if(oms==null)
		{
			message=new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		else
		{
			message=new ResponseEntity<OrderMethod>(oms,HttpStatus.OK);
		}
		return message;

	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id)
	{
		ResponseEntity<String> message=null;

		try
		{
			service.deleteOrders(id);
			message=new ResponseEntity<String>("order deleted done",HttpStatus.OK);


		}catch (Exception e) {

			message=new ResponseEntity<String>("order not exists",HttpStatus.BAD_REQUEST);

		}
		return message;
	}
	@PostMapping("/insert")
	public ResponseEntity<String> save(@RequestBody OrderMethod om)
	{
		ResponseEntity<String> message=null;
		try
		{
			Integer id=service.saveOrders(om);
			message=new ResponseEntity<String>("Inserted Order of id:"+id,HttpStatus.OK);

		}catch(Exception e)
		{
			message=new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		return message;
	}

	@PutMapping("/update")
	public ResponseEntity<String> update(@RequestBody OrderMethod om)
	{

		ResponseEntity<String> message=null;
		try
		{
			service.updateOrders(om);
			message=new ResponseEntity<String>("Updated uom of id:"+om.getId(),HttpStatus.OK);

		}catch(Exception e)
		{
			message=new ResponseEntity<String>("uom id'"+om.getId()+"' not found",HttpStatus.BAD_REQUEST);
		}
		return message;
	}







}
