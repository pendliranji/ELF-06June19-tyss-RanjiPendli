package com.app.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.app.model.OrderMethod;

@Component
public class OrderMethodValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return OrderMethod.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		OrderMethod om=(OrderMethod)target;

		if(om.getMode()==null||om.getMode().equals(""))		
		{
			errors.rejectValue("mode", null, "please choose one mode]");


		}

		if(!Pattern.compile("[A-z]{4,8}").matcher(om.getCode()).matches())
		{
			errors.rejectValue("code", null, "please choose code[3-10 uppercase only]");
		}

		if(om.getMethod().equals(""))	
		{
			errors.rejectValue("method", null, "pleasse choose one method");
		}

		if(!Pattern.compile("[A-Za-z0-9\\s\\.]{10,200}").matcher(om.getDsc()).matches())
		{
			errors.rejectValue("dsc", null, "please enter description[10-200 chars]");
		}


		if(om.getAccept()==null||om.getAccept().isEmpty())
		{
			errors.rejectValue("accept", null, "please choose atleast one accept box");


		}




	}

}
