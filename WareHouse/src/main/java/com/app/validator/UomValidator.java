package com.app.validator;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.app.model.Uom;
import com.app.service.IUomService;
@Component
public class UomValidator implements Validator{

	@Autowired
	private IUomService service;
	@Override
	public boolean supports(Class<?> clazz) {
		return Uom.class.equals(clazz);

	}

	@Override
	public void validate(Object target, Errors errors) {
		Uom uom=(Uom)target;
		//for drop down
		if(uom.getType().equals(""))		
		{
			errors.rejectValue("type", null, "please select one type");	
		}
		if(!Pattern.compile("[A-Z]{4,8}").matcher(uom.getModel()).matches())
		{
			errors.rejectValue("model", null, "please enter a valid model[4-8 UPPERCASE only]");
		}else if(service.isUomModelExist(uom.getModel()))
		{
			errors.rejectValue("model", null, "Uom model alreadyExist,please try with new One");
			
		}

		if(!Pattern.compile("[A-Za-z0-9\\s\\.]{10,200}").matcher(uom.getDsc()).matches())
		{
			errors.rejectValue("dsc", null, "please enter some description[10-200]");
		}


	}

}
