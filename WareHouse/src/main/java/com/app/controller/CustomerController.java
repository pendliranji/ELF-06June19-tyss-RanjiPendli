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

import com.app.model.Customer;
import com.app.service.ICustomerService;
import com.app.validator.CustomerValidator;
import com.app.view.CustomerExcelView;
import com.app.view.CustomerPdfView;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerValidator validator;
	
	@Autowired
	private ICustomerService service;
	@RequestMapping("/reg")
	public String showRegPage(ModelMap map)
	{
		map.addAttribute("customer", new Customer());
		return "CustomerRegister";
	}
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insertOrder(@ModelAttribute("customer") Customer customer,Errors errors,ModelMap map)
	{
		validator.validate(customer, errors);
		if(!errors.hasErrors())
		{
		
		Integer id=service.saveCustomer(customer);
		map.addAttribute("message","Customer given with id: "+id);
		map.addAttribute("customer", new Customer());
		}
		return "CustomerRegister";
		
	}
	@RequestMapping("/all")
	public String getOrderData(ModelMap map)
	{
		List<Customer> list=service.getAllCustomers();
		map.addAttribute("list", list);
		return "CustomerData";
	}
	@RequestMapping("/delete")
	public String deleteOrder(@RequestParam("id")Integer id,ModelMap map)
	{
		service.deleteCustomer(id);;
		map.addAttribute("message", "Customer deletd of id:: "+id);
		List<Customer> list=service.getAllCustomers();
		map.addAttribute("list", list);
		return "CustomerData";
		
	}
	@RequestMapping("/edit")
	public String editOrder(@RequestParam("id")Integer id,ModelMap map)
	{
		Customer list=service.getOneCustomerById(id);
		map.addAttribute("customer", list);
		return "CustomerEdit";
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String updateOrder(@ModelAttribute("customer") Customer customer,ModelMap map)
	{
		service.updateCustomer(customer);;
		map.addAttribute("message","order updated successfully id::"+customer.getCustId());
		List<Customer> list=service.getAllCustomers();
		map.addAttribute("list", list);

		return "CustomerData";
	}
	
	
	@RequestMapping("/excel")
	public ModelAndView excelFormat()
	{
		ModelAndView m=new ModelAndView();
		m.setView(new CustomerExcelView());
		List<Customer> uom=service.getAllCustomers();
		m.addObject("uom",uom);
		return m;
	}
	@RequestMapping("/pdf")
	public ModelAndView pdfData()
	{
		ModelAndView m=new ModelAndView();
		m.setView(new CustomerPdfView());
		List<Customer> uom=service.getAllCustomers();
		m.addObject("uom",uom);
		return m;
	}
	
	
	
	
	
}
