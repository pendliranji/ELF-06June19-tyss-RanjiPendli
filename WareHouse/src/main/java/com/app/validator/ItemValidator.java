
package com.app.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.app.model.Item;
@Component
public class ItemValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Item.class.equals(clazz);
	}

	
	public void validate(Object target, Errors errors) {

		Item i=(Item)target;

		if(!Pattern.compile("[A-Z]{4,8}").matcher(i.getItCode()).matches())
		{
			errors.rejectValue("itCode", null, "please enter code[4-8 chars uppercase only]");
		}


		if(i.getItWidth()==null||i.getItLength()==null||i.getItHeight()==null||i.getItHeight()<=0.0||i.getItLength()<=0.0 ||i.getItWidth()<=0.0||i.getItHeight()<=0||i.getItLength()<=0||i.getItWidth()<=0)
		{
			errors.rejectValue("itWidth", null, "please enter dimensions");
		}
		

		if(i.getItCost()==null||i.getItCost()<=0.0||i.getItCost()<=0)
		{
			errors.rejectValue("itCost", null, "please enter cost");
		}

		if(i.getItCurrency().equals(""))
		{
			errors.rejectValue("itCurrency", null,"please choose one country currency");
		}
		if(i.getUomm()==null ||i.getUomm().getId()==null)
		{
			
			errors.rejectValue("uomm", null, "please choose one uom type");
		}

		if(i.getSaleType()==null ||i.getSaleType().getId()==null)
		{
			errors.rejectValue("saleType", null, "please select one sale type");
		}

		if(i.getPurchaseType()==null ||i.getPurchaseType().getId()==null)
		{
			errors.rejectValue("purchaseType", null, "please select one purchase type");
		}

		
		
		if(i.getCustUsers()==null ||i.getCustUsers().isEmpty())
		{
			errors.rejectValue("custUsers", null, "please choose atleast one customer");	
		}

		if(i.getVenUsers()==null ||i.getVenUsers().isEmpty())
		{
			errors.rejectValue("venUsers", null, "please choose atleast one vendor");	
		}


		if(!Pattern.compile("[A-Za-z0-9\\.\\s]{10,200}").matcher(i.getItDsc().trim()).matches())
		{
			errors.rejectValue("itDsc",null,"please enter description[10-200 chars]");
		}


	}

}
