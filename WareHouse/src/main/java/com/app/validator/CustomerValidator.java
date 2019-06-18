package com.app.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.app.model.Customer;
@Component
public class CustomerValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Customer.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		Customer c=(Customer)target;
		
		if(!Pattern.compile("[A-Za-z0-9]{1,12}").matcher(c.getCustCode()).matches())
		{
			errors.rejectValue("custCode", null, "please enter code");
		}
		
		if("".equals(c.getCustAddr()) ||c.getCustAddr()==null)
		{
			errors.rejectValue("custAddr", null, "please enter code");
		}
		ValidationUtils.rejectIfEmpty(errors, "custLocs", null, "please choose one location");
	
		ValidationUtils.rejectIfEmpty(errors, "custEnabled", null, "please choose one button");
		if(!Pattern.compile("[0-9]{10}").matcher(c.getCustContact()).matches())
		{
			
			errors.rejectValue("custContact", null, "please enter your number");

		}
		
		
		
		
		
		
		
	}

}
