package com.app.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IUomDao;
import com.app.model.Item;
import com.app.model.Uom;
@Repository
public class UomDaoImpl implements IUomDao{

	@Autowired
	private HibernateTemplate ht;

	public Integer UomInsert(Uom u) {
		return (Integer) ht.save(u);
	}

	public void UomUpdate(Uom u) {

		ht.update(u);
	}

	public void UomDelete(Integer id) {

		Uom u=new Uom();
		u.setId(id);
		ht.delete(u);

	}

	public Uom getOneUom(Integer id) {
		return ht.get(Uom.class, id);
	}

	public List<Uom> getAllUoms() {
		return ht.loadAll(Uom.class);
	}

	@Override
	public boolean isUomModelExist(String model) {

		@SuppressWarnings("unchecked")
		List<Long> count=(List<Long>) ht.findByCriteria(				
				DetachedCriteria.forClass(Uom.class).setProjection(Projections.rowCount())
				.add(Restrictions.eq("model", model)));

		return count.get(0)!=0?true:false;
	}

	@Override
	public boolean isUomConnectedWithItem(Integer id) {

		@SuppressWarnings("unchecked")
		List<Long> count=(List<Long>)ht.findByCriteria(
				DetachedCriteria.forClass(Item.class).setProjection(Projections.rowCount()).add(Restrictions.eq("uomm.id", id))
				);
		return count.get(0)!=0?true:false;
	}

}
