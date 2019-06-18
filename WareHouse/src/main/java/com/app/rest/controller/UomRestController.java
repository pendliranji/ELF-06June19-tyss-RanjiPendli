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

import com.app.model.Uom;
import com.app.service.IUomService;

@RestController
@RequestMapping("/rest/uom")
public class UomRestController {

	@Autowired
	private IUomService service;
	//for all--getting all
	@GetMapping("/all")
	public ResponseEntity<?> getAll()
	{
		List<Uom> uoms=service.getAllUoms();
		ResponseEntity<?> message=null;
		if(uoms.isEmpty() ||uoms==null)
		{

			message=new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}else
		{
			message=new ResponseEntity<List<Uom>>(uoms,HttpStatus.OK);

		}
		return message;
	}

	//getting only One by id.....
	@GetMapping("/get/{id}")
	public ResponseEntity<?> getOne(@PathVariable("id") Integer id)
	{
		ResponseEntity<?> message=null;
		Uom uom=service.getOneUom(id);
		if(uom==null)
		{
			message=new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		else
		{
			message=new ResponseEntity<>(uom,HttpStatus.OK);
		}
		return message;
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id)
	{
		ResponseEntity<String> message;

		try
		{
			service.UomDelete(id);
			message=new ResponseEntity<String>("uom deleted successfully",HttpStatus.OK);

		}catch (Exception e) {

			message=new ResponseEntity<String>("uom not found",HttpStatus.BAD_REQUEST);
		}
		return message;
	}

	//save into db
	@PostMapping("/insert")
	public ResponseEntity<String> save(@RequestBody Uom u)
	{
		ResponseEntity<String> message=null;
		try
		{
			Integer id=service.UomInsert(u);
			message=new ResponseEntity<String>("Inserted uom of id:"+id,HttpStatus.OK);
			
		}catch(Exception e)
		{
			message=new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		return message;
	}

	@PutMapping("/update")
	public ResponseEntity<String> update(@RequestBody Uom u)
	{
		
		ResponseEntity<String> message=null;
		try
		{
			service.UomUpdate(u);;
			message=new ResponseEntity<String>("Updated uom of id:"+u.getId(),HttpStatus.OK);
			
		}catch(Exception e)
		{
			message=new ResponseEntity<String>("uom id'"+u.getId()+"' not found",HttpStatus.BAD_REQUEST);
		}
		return message;
	}








}
