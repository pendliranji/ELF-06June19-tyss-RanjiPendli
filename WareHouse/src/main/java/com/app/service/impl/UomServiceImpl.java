package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUomDao;
import com.app.model.Uom;
import com.app.service.IUomService;
@Service
public class UomServiceImpl implements IUomService{

	@Autowired
	private IUomDao dao;
	@Transactional
	public Integer UomInsert(Uom u) {
		return dao.UomInsert(u);
	}

	@Transactional
	public void UomUpdate(Uom u) {

		dao.UomUpdate(u);
	}

	@Transactional	public void UomDelete(Integer id) {
		dao.UomDelete(id);
	}

	@Transactional(readOnly=true)
	public Uom getOneUom(Integer id) {

		return dao.getOneUom(id);
	}

	@Transactional(readOnly=true)
	public List<Uom> getAllUoms() {
		return dao.getAllUoms();
	}

	@Transactional(readOnly=true)
	public boolean isUomModelExist(String model) {

		return dao.isUomModelExist(model);
	}

	@Transactional(readOnly=true)
	public boolean isUomConnectedWithItem(Integer id) {
		// TODO Auto-generated method stub
		return dao.isUomConnectedWithItem(id);
	}

}
