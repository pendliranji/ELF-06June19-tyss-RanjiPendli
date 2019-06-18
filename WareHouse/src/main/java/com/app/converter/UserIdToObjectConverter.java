package com.app.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.app.model.WhUserType;
import com.app.service.IUserTypeService;
@Component
public class UserIdToObjectConverter implements Converter<Object, WhUserType>{

	@Autowired
	private IUserTypeService service; 
	
	
	@Override
	public WhUserType convert(Object wid) {
		try
		{
		int id=Integer.parseInt((String)wid);
		return service.getOneUserType(id);
		}catch(Exception e)
		{
			return new WhUserType();
		}
	}



}
