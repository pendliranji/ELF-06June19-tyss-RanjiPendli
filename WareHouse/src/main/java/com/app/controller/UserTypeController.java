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

import com.app.model.WhUserType;
import com.app.service.IUserTypeService;
import com.app.validator.WhUserTypeValidator;
import com.app.view.UserTypeExcelView;
import com.app.view.UserTypePdfView;

@Controller
@RequestMapping("/user")
public class UserTypeController {


	@Autowired
	private WhUserTypeValidator validator;
	@Autowired
	private IUserTypeService service;
	@RequestMapping("/reg")
	public String showUser(ModelMap map)
	{
		map.addAttribute("user",new WhUserType());
		return "UserRegister";
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insertData(@ModelAttribute("user")WhUserType user,Errors errors,ModelMap map)
	{
		System.out.println("1111");
		validator.validate(user, errors);
		if(!errors.hasErrors()) {
		Integer id=service.userTypeInsert(user);
		map.addAttribute("message", "User with id '"+id+"' created");
		map.addAttribute("user",new WhUserType());
		}
		return "UserRegister";
	}
	
	//getting data
	@RequestMapping("/all")
	public String getData(ModelMap map)
	{
		List<WhUserType> list=service.getAllUserTypes();
		map.addAttribute("list",list);
		
		return "UserData";
	}
	
	//delete operations
	@RequestMapping("/delete")
	public String doDel(@RequestParam("id")Integer id,ModelMap map)
	{
		String message=null;
		try
		{
			if(service.isUserCustConnectedWithItem(id))
			{
				message="This Cannot be deleted of id "+id;
				
			}else
			{
			service.userTypeDelete(id);;
			
			message="Record delted of id "+id;
			}
		}
		catch(HibernateOptimisticLockingFailureException e)
		{
			message="Not Found :"+id;
			
		}
		map.addAttribute("message",message);
		List<WhUserType> list=service.getAllUserTypes();
		map.addAttribute("list", list);
		return "UserData";
	}
	@RequestMapping("/edit")
	public String doEdit(@RequestParam("id")Integer id,ModelMap map)
	{
		WhUserType list=service.getOneUserType(id);
		map.addAttribute("user",list);
		return "UserEdit";
	}
	
	///updating data
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String doUpdate(@ModelAttribute("user") WhUserType user,ModelMap map)
	{
		service.userTypeUpdate(user);;
		map.addAttribute("message","updation success of id "+user.getId());
		
		List<WhUserType> list=service.getAllUserTypes();
		map.addAttribute("list",list);
		return "UserData";
	}
	
	

	@RequestMapping("/excel")
	public ModelAndView excelFormat()
	{
		ModelAndView m=new ModelAndView();
		m.setView(new UserTypeExcelView());
		List<WhUserType> uom=service.getAllUserTypes();
		m.addObject("uom",uom);
		return m;
	}
	@RequestMapping("/pdf")
	public ModelAndView pdfData()
	{
		ModelAndView m=new ModelAndView();
		m.setView(new UserTypePdfView());
		List<WhUserType> uom=service.getAllUserTypes();
		m.addObject("uom",uom);
		return m;
	}
	
	
	
	
}
