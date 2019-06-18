package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IPictureDao;
import com.app.model.Picture;
@Repository
public class PictureDaoImpl implements IPictureDao{

	@Autowired
	private HibernateTemplate ht;
	@Override
	public Integer savePic(Picture p) {
		return (Integer) ht.save(p);
	}

	@Override
	public void updatePic(Picture p) {
		ht.update(p);
	}

	@Override
	public void deletePic(Integer id) {
		Picture p=new Picture();
		p.setpId(id);
		ht.delete(p);
	}

	@Override
	public Picture getOnePic(Integer id) {
		return ht.get(Picture.class, id);
	}

	@Override
	public List<Picture> getAllPics() {
		return ht.loadAll(Picture.class);
	}

}
