package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Picture;
import com.app.service.IPictureService;

@Controller
public class PictureController {

	@Autowired
	private IPictureService service;
	@RequestMapping("reg")
	public String reg(ModelMap map)
	{
		map.addAttribute("picture", new Picture());
		return "PictureRegister";
	}
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insert(@ModelAttribute("picture") Picture picture,ModelMap map) {
		Integer i=service.savePic(picture);
		map.addAttribute("message", "id created "+i);

		map.addAttribute("picture", new Picture());
		return "PictureRegister";
	}
	@RequestMapping("/get")
	public String getPicss(ModelMap map)
	{
		List<Picture> all=service.getAllPics();
		map.addAttribute("list", all);
		
		return "PictureData";
	}

	@RequestMapping("/delete")
	public String del(@RequestParam("id") Integer id,ModelMap map)
	{
		service.deletePic(id);
		map.addAttribute("message", id+" id deleted");
		List<Picture> all=service.getAllPics();
		map.addAttribute("list", all);

		return "PictureData";
	}
	
	@RequestMapping("/edit")
	public String edit(@RequestParam("id") Integer id,ModelMap map)
	{
		Picture p=service.getOnePic(id);
		map.addAttribute("picture", p);
		return "PictureEdit";

	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(@ModelAttribute("picture") Picture picture,ModelMap map) {
	  service.updatePic(picture);
		map.addAttribute("message", "id update "+picture.getpId());

		List<Picture> all=service.getAllPics();
		map.addAttribute("list", all);
		return "PictureData";
	}

}
