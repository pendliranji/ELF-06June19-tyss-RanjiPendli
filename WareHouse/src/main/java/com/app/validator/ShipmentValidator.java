package com.app.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.app.model.ShipmentType;

@Component
public class ShipmentValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return ShipmentType.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		ShipmentType ship=(ShipmentType)target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mode", null, "please choose one mode");
		if(!Pattern.compile("[A-Z]{4,8}").matcher(ship.getCode()).matches()) {
		
			errors.rejectValue("code", null, "please enter code[3-10 Uppercase only]");
		}
		
		if(ship.getGrade()==null || ship.getGrade().equals(""))
		{
			errors.rejectValue("grade", null, "please choose one grade");

			
		}
			
		
		
		if(!Pattern.compile("[A-Za-z0-9\\s\\.]{10,200}").matcher(ship.getDsc()).matches())
		{
			errors.rejectValue("dsc", null, "please enter description[10-200]");
		}
		
		
		
		
		
	}

}
