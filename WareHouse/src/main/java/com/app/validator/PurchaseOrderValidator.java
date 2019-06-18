package com.app.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.app.model.PurchaseOrder;
@Component
public class PurchaseOrderValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return PurchaseOrder.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		PurchaseOrder po=(PurchaseOrder)target;

		if(!Pattern.compile("[A-Z]{4,8}").matcher(po.getCode()).matches())
		{

			errors.rejectValue("code", null, "please enter valid code[3-10 uppercase only]");
		}

		if(po.getShip()==null||po.getShip().getId()==null)
		{
			errors.rejectValue("ship", null, "Please choose one shipment type");
		}
		if(po.getTypeUser()==null||po.getTypeUser().getId()==null)
		{
			errors.rejectValue("typeUser", null, "please choose one vendor type");
		}


		if(!Pattern.compile("[A-Z0-9]{4}\\-[A-Z0-9]{4}\\-[A-Z0-9]{4}").matcher(po.getNum()).matches())
		{			
			errors.rejectValue("num", null, "please enter valid Reference number");


		}
		if(po.getCheck()==null||po.getCheck().equals(""))
		{
			errors.rejectValue("check", null, "please choose one check type");

		}

		if(!Pattern.compile("[A-Za-z0-9\\_]{10,200}").matcher(po.getDsc()).matches())
		{
			errors.rejectValue("dsc", null, "please enter desciption[10-200 ]");

		}


	}

}
