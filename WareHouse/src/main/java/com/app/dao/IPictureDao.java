package com.app.dao;

import java.util.List;

import com.app.model.Picture;

public interface IPictureDao {

	public Integer savePic(Picture p);
	public void updatePic(Picture p);
	public void deletePic(Integer id);
	public Picture getOnePic(Integer id);
	public List<Picture> getAllPics();

}
