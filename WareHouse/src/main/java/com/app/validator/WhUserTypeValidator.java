package com.app.validator;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.app.model.WhUserType;
import com.app.service.IUserTypeService;

@Component
public class WhUserTypeValidator implements Validator {

	@Autowired
	private IUserTypeService service;
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return WhUserType.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {


		WhUserType user=(WhUserType)target;

		if(user.getType()==null ||user.getType().equals(""))
		{
			errors.rejectValue("type", null, "please choose one type");

		}

		if(!Pattern.compile("[A-Z]{4,8}").matcher(user.getCode()).matches())
		{
			errors.rejectValue("code", null, "please enter code[4-8 uppercase only]");

		}

		

		if(!Pattern.compile("[A-Za-z\\.\\_\\+]+[0-9]*[\\@][a-zA-Z]+[\\.][a-zA-Z]+").matcher(user.getEmail()).matches())
		{
			errors.rejectValue("email", null, "please enter email");

		}else if(service.isUserTypeEmailExist(user.getEmail()))
		{
			errors.rejectValue("email", null, "This Mail alread exist..Please try new One");
		}

		if(!Pattern.compile("[\\+][9][1][0-9]{10}").matcher(user.getContact()).matches())
		{
			errors.rejectValue("contact", null, "please enter your contact number");

		}

		if(user.getIdType().equals(""))
		{
			errors.rejectValue("idType", null, "please choose one Id type");
		}

		if(!Pattern.compile("[A-Z0-9]{1,10}").matcher(user.getIdNum()).matches())
		{
			errors.rejectValue("idNum", null, "please enter your id");

		}

	}

}
