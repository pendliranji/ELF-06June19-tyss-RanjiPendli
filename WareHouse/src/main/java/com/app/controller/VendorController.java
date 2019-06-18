package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Vendor;
import com.app.service.IVendorService;
import com.app.validator.VendorValidator;
import com.app.view.VendorExcelView;
import com.app.view.VendorPdfView;

@Controller
@RequestMapping("/vendor")
public class VendorController {
	

	@Autowired
	private VendorValidator validator;
	
	@Autowired
	private IVendorService service;
	@RequestMapping("/reg")
	public String showRegPage(ModelMap map)
	{
		map.addAttribute("vendor", new Vendor());
		return "VendorRegister";
	}
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insertVendor(@ModelAttribute("vendor") Vendor vendor,Errors errors,ModelMap map)
	{
		validator.validate(vendor, errors);
		if(!errors.hasErrors())
		{
		Integer id=service.saveVendors(vendor);
		map.addAttribute("message","order given with id: "+id);
		map.addAttribute("vendor", new Vendor());
		}
		return "VendorRegister";
	}
	@RequestMapping("/all")
	public String getVendorData(ModelMap map)
	{
		List<Vendor> list=service.getAllVendors();
		map.addAttribute("list", list);
		return "VendorData";
	}
	@RequestMapping("/delete")
	public String deleteVendor(@RequestParam("id")Integer id,ModelMap map)
	{
		service.deleteVendors(id);
		map.addAttribute("message", "Order deletd of id:: "+id);
		List<Vendor> list=service.getAllVendors();
		map.addAttribute("list", list);
		return "VendorData";
		
	}
	@RequestMapping("/edit")
	public String editVendor(@RequestParam("id")Integer id,ModelMap map)
	{
		Vendor list=service.getOneVendorById(id);
		map.addAttribute("vendor", list);
		return "VendorEdit";
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String updateVendor(@ModelAttribute("vendor") Vendor vendor,ModelMap map)
	{
		service.updateVendors(vendor);;
		map.addAttribute("message","order updated successfully id::"+vendor.getVenId());
		List<Vendor> list=service.getAllVendors();
		map.addAttribute("list", list);

		return "VendorData";
	}
	
	
	@RequestMapping("/excel")
	public ModelAndView excelFormat()
	{
		ModelAndView m=new ModelAndView();
		m.setView(new VendorExcelView());
		List<Vendor> uom=service.getAllVendors();
		m.addObject("uom",uom);
		return m;
	}
	@RequestMapping("/pdf")
	public ModelAndView pdfData()
	{
		ModelAndView m=new ModelAndView();
		m.setView(new VendorPdfView());
		List<Vendor> uom=service.getAllVendors();
		m.addObject("uom",uom);
		return m;
	}
	
	

}
