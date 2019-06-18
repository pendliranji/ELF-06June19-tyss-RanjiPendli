package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IPictureDao;
import com.app.model.Picture;
import com.app.service.IPictureService;
@Service
public class PictureServiceImpl implements IPictureService {

	@Autowired
	private IPictureDao dao;

	@Transactional
	public Integer savePic(Picture p) {
		// TODO Auto-generated method stub
		return dao.savePic(p);
	}

	@Transactional
	public void updatePic(Picture p) {
		dao.updatePic(p);
	}

	@Transactional
	public void deletePic(Integer id) {
		dao.deletePic(id);
	}

	@Transactional(readOnly=true)
	public Picture getOnePic(Integer id) {
		return dao.getOnePic(id);
	}

	@Transactional(readOnly=true)
	public List<Picture> getAllPics() {
		return dao.getAllPics();
	}

}
