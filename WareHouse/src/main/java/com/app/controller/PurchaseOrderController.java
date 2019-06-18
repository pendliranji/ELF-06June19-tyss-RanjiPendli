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

import com.app.model.PurchaseOrder;
import com.app.model.ShipmentType;
import com.app.model.WhUserType;
import com.app.service.IPurchaseOrderService;
import com.app.service.IShipmentTypeService;
import com.app.service.IUserTypeService;
import com.app.validator.PurchaseOrderValidator;

@Controller
@RequestMapping("/purchase")
public class PurchaseOrderController {


	@Autowired
	private IPurchaseOrderService service;

	@Autowired
	private PurchaseOrderValidator validator;

	@Autowired
	private IUserTypeService userService;

	@Autowired
	private IShipmentTypeService shipService;

	@RequestMapping("/reg")
	public String save(ModelMap map)
	{

		map.addAttribute("purchase", new PurchaseOrder());
		//for user Type forvendor
		List<WhUserType> vens=userService.getUserTypeByType("vendor");
		map.addAttribute("vens", vens);

		//for shipment type enabled===yes
		List<ShipmentType> enable=shipService.getAllShipmentsTypesByEnbled("yes");
		map.addAttribute("enable", enable);

		return "PurchaseRegister";
	}
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insert(@ModelAttribute("purchase")PurchaseOrder purchase,Errors errors,ModelMap map)
	{




		validator.validate(purchase, errors);
		if(!errors.hasErrors())
		{

			Integer id=service.savePurchasseOrder(purchase);
			map.addAttribute("message", "Orderof id '"+id+"' created");

			//for user Type forvendor
			List<WhUserType> vens=userService.getUserTypeByType("vendor");
			map.addAttribute("vens", vens);


			//for shipment type enabled===yes
			List<ShipmentType> enable=shipService.getAllShipmentsTypesByEnbled("yes");
			map.addAttribute("enable", enable);

			map.addAttribute("purchase", new PurchaseOrder());

		}

		return "PurchaseRegister";
	}

	@RequestMapping("/all")
	public String getPurchase(ModelMap map)
	{
		List<PurchaseOrder> po=service.getAllPurchaseOrder();
		map.addAttribute("po", po);
		return "PurchaseData";

	}
	@RequestMapping("/edit")
	public String editPurchase(@RequestParam("id")Integer id,ModelMap map)
	{

		PurchaseOrder p=service.getOnePurchaseOrderById(id);
		map.addAttribute("purchase", p);
		//for user Type forvendor
		List<WhUserType> vens=userService.getUserTypeByType("vendor");
		map.addAttribute("vens", vens);

		//for shipment type enabled===yes
		List<ShipmentType> enable=shipService.getAllShipmentsTypesByEnbled("yes");
		map.addAttribute("enable", enable);

		return "PurchaseEdit";
	}

	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String updateProcess(@ModelAttribute("purchase") PurchaseOrder purchase,ModelMap map)
	{
		service.updatePurchaseOrder(purchase);
		map.addAttribute("message", "order updated successful of id :"+purchase.getId());
		List<PurchaseOrder> list=service.getAllPurchaseOrder();
		map.addAttribute("po", list);


		return "PurchaseData";

	}

	@RequestMapping("/delete")
	public String deletePurchase(@RequestParam("id")Integer id,ModelMap map)
	{
		String message=null;
		try
		{
			service.deletePurchaseOrder(id);
			message="order deleted of id :"+id;
		}catch(HibernateOptimisticLockingFailureException e)
		{
			message="Not Found of id:"+id;
		}
		
		map.addAttribute("message", message);
		List<PurchaseOrder> po=service.getAllPurchaseOrder();
		map.addAttribute("po", po);
		return "PurchaseData";

	}




}
