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

import com.app.model.OrderMethod;
import com.app.service.IOrderMethodService;
import com.app.validator.OrderMethodValidator;
import com.app.view.OrderExcelView;
import com.app.view.OrderPdfView;

@Controller
@RequestMapping("/order")
public class OrderMethodController {
	@Autowired
	private OrderMethodValidator validator;
	@Autowired
	private IOrderMethodService service;
	@RequestMapping("/reg")
	public String showRegPage(ModelMap map)
	{
		map.addAttribute("order", new OrderMethod());
		return "OrderRegister";
	}
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insertOrder(@ModelAttribute("order") OrderMethod order,Errors errors,ModelMap map)
	{
		validator.validate(order, errors);
		if(!errors.hasErrors())
		{
			Integer id=service.saveOrders(order);
			map.addAttribute("message","order given with id: "+id);
			map.addAttribute("order", new OrderMethod());
		}
		return "OrderRegister";
	}
	@RequestMapping("/all")
	public String getOrderData(ModelMap map)
	{
		List<OrderMethod> list=service.getAllOrders();
		map.addAttribute("list", list);
		return "OrderData";
	}
	@RequestMapping("/delete")
	public String deleteOrder(@RequestParam("id")Integer id,ModelMap map)
	{
		String message=null;
		try
		{
			if(service.isOrderConnectedWithItem(id) || service.isOrderPurchaseConnectedWithItem(id))
			{
				message="This cannot be deleted";	
			}else
			{

				service.deleteOrders(id);
				message="Order deletd of id:: "+id;
			}

		}catch(HibernateOptimisticLockingFailureException e)
		{
			message="Not found of id:"+id;
		}

		map.addAttribute("message", message);
		List<OrderMethod> list=service.getAllOrders();
		map.addAttribute("list", list);
		return "OrderData";

	}
	@RequestMapping("/edit")
	public String editOrder(@RequestParam("id")Integer id,ModelMap map)
	{
		OrderMethod list=service.getOneOrderById(id);
		map.addAttribute("order", list);
		return "OrderEdit";
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String updateOrder(@ModelAttribute("order") OrderMethod order,ModelMap map)
	{
		service.updateOrders(order);
		map.addAttribute("message","order updated successfully id::"+order.getId());
		List<OrderMethod> list=service.getAllOrders();
		map.addAttribute("list", list);

		return "OrderData";
	}


	@RequestMapping("/excel")
	public ModelAndView excelFormat()
	{
		ModelAndView m=new ModelAndView();
		m.setView(new OrderExcelView());
		List<OrderMethod> uom=service.getAllOrders();
		m.addObject("uom",uom);
		return m;
	}
	@RequestMapping("/pdf")
	public ModelAndView pdfData()
	{
		ModelAndView m=new ModelAndView();
		m.setView(new OrderPdfView());
		List<OrderMethod> uom=service.getAllOrders();
		m.addObject("uom",uom);
		return m;
	}








}
