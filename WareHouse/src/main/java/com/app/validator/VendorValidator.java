package com.app.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.app.model.Vendor;
@Component
public class VendorValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Vendor.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		Vendor v=(Vendor)target;
		
		
		if(!Pattern.compile("[A-Za-z]{1,10}").matcher(v.getVenName()).matches())
		{

		errors.rejectValue("venName", null, "please enter your name");
		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "venCode", null, "please choose one code");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "venDesg", null, "please choose one design");
		
		
		
		
	}

}
