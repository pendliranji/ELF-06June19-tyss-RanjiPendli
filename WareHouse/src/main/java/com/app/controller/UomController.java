package com.app.controller;

import java.util.List;

import org.apache.log4j.Logger;
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

import com.app.model.Uom;
import com.app.service.IUomService;
import com.app.validator.UomValidator;
import com.app.view.UomExcelView;
import com.app.view.UomPdfView;

@Controller
@RequestMapping("/uom")
public class UomController {
	private static final Logger log=Logger.getLogger(Uom.class);
	
	@Autowired
	private UomValidator validator;
	@Autowired
	private IUomService service;
	@RequestMapping("/reg")
	public String showUom(ModelMap map)
	{
		log.info("uom started show method");
		map.addAttribute("uom",new Uom());
		log.info("returned to uom register page");
		return "UomRegister";
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insertData(@ModelAttribute Uom uom,Errors errors,ModelMap map)
	{
		validator.validate(uom, errors);
		if(!errors.hasErrors())
		{
		Integer id=service.UomInsert(uom);
		map.addAttribute("message", "Uom with id '"+id+"' created");
		map.addAttribute("uom",new Uom());
		}
		return "UomRegister";
		
	}
	
	//getting data
	@RequestMapping("/all")
	public String getData(ModelMap map)
	{
		List<Uom> list=service.getAllUoms();
		map.addAttribute("list",list);
		
		return "UomData";
	}
	
	//delete operations
	@RequestMapping("/delete")
	public String doDel(@RequestParam("id")Integer id,ModelMap map)
	{
		String message=null;
		try
		{
			if(service.isUomConnectedWithItem(id))
			{
				message="Record cant be deleted of id: "+id;
			}else
			{
			
			service.UomDelete(id);
			message="Record delted of id "+id;
			}
		}
		catch (HibernateOptimisticLockingFailureException e) {

			message="Uom record not found for id:: "+id;
		}
		map.addAttribute("message",message);
		List<Uom> list=service.getAllUoms();
		map.addAttribute("list", list);
		return "UomData";
	}
	@RequestMapping("/edit")
	public String doEdit(@RequestParam("id")Integer id,ModelMap map)
	{
		Uom list=null;
		String message=null;
		
		try
		{
			 list=service.getOneUom(id);
			
		}catch(Exception e)
		{
			message="no such id found";
		}
		
		map.addAttribute("uom",list);
		map.addAttribute("message",message);
		return "UomEdit";
	}
	
	///updating data
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String doUpdate(@ModelAttribute("uom") Uom uom,ModelMap map)
	{
		String message=null;
		try
		{
			service.UomUpdate(uom);
			message="updation success of id "+uom.getId();
		}catch(Exception e)
		{
			message="Not found of id: "+uom.getId();
		}
		
		map.addAttribute("message",message);
		
		List<Uom> list=service.getAllUoms();
		map.addAttribute("list",list);
		return "UomData";
	}
	@RequestMapping("/excel")
	public ModelAndView excelFormat()
	{
		ModelAndView m=new ModelAndView();
		m.setView(new UomExcelView());
		List<Uom> uom=service.getAllUoms();
		m.addObject("uom",uom);
		return m;
	}
	@RequestMapping("/pdf")
	public ModelAndView pdfData()
	{
		ModelAndView m=new ModelAndView();
		m.setView(new UomPdfView());
		List<Uom> uom=service.getAllUoms();
		m.addObject("uom",uom);
		return m;
	}
	
	
	
	
}
