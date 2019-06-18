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

import com.app.model.Item;
import com.app.model.OrderMethod;
import com.app.model.Uom;
import com.app.model.WhUserType;
import com.app.service.IItemService;
import com.app.service.IOrderMethodService;
import com.app.service.IUomService;
import com.app.service.IUserTypeService;
import com.app.validator.ItemValidator;
import com.app.view.ItemExcelView;
import com.app.view.ItemPdfView;

@Controller
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private IItemService service;
	@Autowired
	private IUomService uomService;

	@Autowired
	private IOrderMethodService omService;

	@Autowired
	private IUserTypeService userService;

	@Autowired
	private ItemValidator validator;



	@RequestMapping("/reg")
	public String showReg(ModelMap map)
	{
		map.addAttribute("item", new Item());

		//for uom data
		List<Uom> uoms=uomService.getAllUoms();
		map.addAttribute("uoms", uoms);

		//for order method --sales type
		List<OrderMethod> sales=omService.getOrderMethodByMode("sale");
		map.addAttribute("sales", sales);

		//for ordermethod --purchase type
		List<OrderMethod> purchases=omService.getOrderMethodByMode("purchase");
		map.addAttribute("purchases", purchases);

		//for user Type forvendor
		List<WhUserType> vens=userService.getUserTypeByType("vendor");
		map.addAttribute("vens", vens);

		List<WhUserType> customers=userService.getUserTypeByType("customer");
		map.addAttribute("customers", customers);

		return "ItemRegister";
	}

	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insertItem(@ModelAttribute("item") Item item,Errors errors,ModelMap map)
	{
		validator.validate(item, errors);
		if(!errors.hasErrors())
		{
		Integer id=service.saveItem(item);
		map.addAttribute("message", "item saved of id  :"+id);
		List<Uom> uoms=uomService.getAllUoms();
		map.addAttribute("uoms", uoms);

		map.addAttribute("item",new Item());

		List<OrderMethod> sales=omService.getOrderMethodByMode("sale");
		map.addAttribute("sales", sales);

		List<OrderMethod> purchases=omService.getOrderMethodByMode("purchase");
		map.addAttribute("purchases", purchases);

		//for user Type forvendor
		List<WhUserType> vens=userService.getUserTypeByType("vendor");
		map.addAttribute("vens", vens);

		List<WhUserType> customers=userService.getUserTypeByType("customer");
		map.addAttribute("customers", customers);

		//new form
		
		}
		
		
		return "ItemRegister";
	}
	@RequestMapping("/all")
	public String getData(ModelMap map)
	{
		List<Item> list=service.getAllItems();
		map.addAttribute("list", list);
		return "ItemData";
	}

	@RequestMapping("/delete")
	public String deleteItem(@RequestParam Integer id,ModelMap map)
	{
		String message=null;
		try
		{
			service.deleteItem(id);
			message="item deleted of id "+id;
		}catch(HibernateOptimisticLockingFailureException e)
		{
			message="Item Not Found of id:"+id;
		}
		
		map.addAttribute("message",message);
		List<Item> list=service.getAllItems();
		map.addAttribute("list", list);
		return "ItemData";
	}
	@RequestMapping("/edit")
	public String editItem(@RequestParam Integer id,ModelMap map)
	{
		Item item=service.getOneItemById(id);
		map.addAttribute("item", item);
		List<Uom> uoms=uomService.getAllUoms();
		map.addAttribute("uoms",uoms);

		List<OrderMethod> sales=omService.getOrderMethodByMode("sale");
		map.addAttribute("sales", sales);

		List<OrderMethod> purchases=omService.getOrderMethodByMode("purchase");
		map.addAttribute("purchases", purchases);

		//for user Type forvendor
		List<WhUserType> vens=userService.getUserTypeByType("vendor");
		map.addAttribute("vens", vens);

		List<WhUserType> customers=userService.getUserTypeByType("customer");
		map.addAttribute("customers", customers);

		return "ItemEdit";
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String updateItem(@ModelAttribute("item") Item item,ModelMap map)
	{
		service.updateItem(item);
		map.addAttribute("message", "item updation success with id :"+item.getItId());
		List<Item> list=service.getAllItems();
		map.addAttribute("list",list);

		return "ItemData";
	}

	@RequestMapping("/excel")
	public ModelAndView excelData()
	{
		ModelAndView m=new ModelAndView();
		m.setView(new ItemExcelView());
		List<Item> item=service.getAllItems();

		m.addObject("item", item);
		return m;
	}

	@RequestMapping("/pdf")
	public ModelAndView pdfData()
	{
		ModelAndView m=new ModelAndView();
		m.setView(new ItemPdfView());
		List<Item> item=service.getAllItems();
		m.addObject("item",item);

		return m;
	}

}
