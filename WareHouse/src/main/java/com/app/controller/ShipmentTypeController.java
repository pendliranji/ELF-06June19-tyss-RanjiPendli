package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateOptimisticLockingFailureException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.ShipmentType;
import com.app.service.IShipmentTypeService;
import com.app.validator.ShipmentValidator;
import com.app.view.ShipmentExcelView;
import com.app.view.ShipmentPdfView;
@Controller
@RequestMapping("/shipment")
public class ShipmentTypeController {

	@Autowired
	private ShipmentValidator validator;
	
	@Autowired
	private IShipmentTypeService service;
	@RequestMapping("/reg")
	public String showShipment(ModelMap map)
	{
		map.addAttribute("shipment",new ShipmentType());
		return "ShipmentRegister";
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insertData(@ModelAttribute("shipment")ShipmentType shipment,Errors errors,ModelMap map)
	{
		System.out.println("in");
		validator.validate(shipment, errors);
		System.out.println("out");
		if(!errors.hasErrors()) {
		Integer id=service.shipmentTypeInsert(shipment);
		map.addAttribute("message", "shipment with id '"+id+"' created");
		map.addAttribute("shipment",new ShipmentType());
		
		}
		return "ShipmentRegister";
	}
	
	//getting data
	
	@RequestMapping("/all")
	public String getData(ModelMap map)
	{
		List<ShipmentType> list=service.getAllShipmentTypes();
		map.addAttribute("list",list);
		
		return "ShipmentData";
	}
	
	@RequestMapping("/delete")
	public String doDel(@RequestParam("id")Integer id,ModelMap map)
	{
		String message=null;
		try
		{
			service.shipmentTypeDelete(id);
			message="Record delted of id "+id;
			
		}catch(HibernateOptimisticLockingFailureException e)
		{
			message="Not Found of id:"+id;
		}
		map.addAttribute("message",message);
		List<ShipmentType> list=service.getAllShipmentTypes();
		map.addAttribute("list", list);
		return "ShipmentData";
	}
	
	@RequestMapping("/edit")
	public String doEdit(@RequestParam("id")Integer id,ModelMap map)
	{
		ShipmentType list=service.getOneShipmentType(id);
		map.addAttribute("shipment",list);
		return "ShipmentEdit";
	}
	
	///updating data
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String doUpdate(@ModelAttribute("shipment") ShipmentType shipment,ModelMap map)
	{
		service.shipmentTypeUpdate(shipment);
		map.addAttribute("message","updation success of id "+shipment.getId());
		
		List<ShipmentType> list=service.getAllShipmentTypes();
		map.addAttribute("list",list);
		return "ShipmentData";
	}
	

	@RequestMapping("/excel")
	public ModelAndView excelFormat()
	{
		ModelAndView m=new ModelAndView();
		m.setView(new ShipmentExcelView());
		List<ShipmentType> uom=service.getAllShipmentTypes();
		m.addObject("uom",uom);
		return m;
	}
	@RequestMapping("/pdf")
	public ModelAndView pdfData()
	{
		ModelAndView m=new ModelAndView();
		m.setView(new ShipmentPdfView());
		List<ShipmentType> uom=service.getAllShipmentTypes();
		m.addObject("uom",uom);
		return m;
	}
	
	
	
	
	
	
	
	
	}
