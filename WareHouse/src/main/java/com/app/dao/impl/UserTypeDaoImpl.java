package com.app.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IUserTypeDao;
import com.app.model.Item;
import com.app.model.WhUserType;
@Repository
public class UserTypeDaoImpl implements IUserTypeDao {

	@Autowired
	private HibernateTemplate ht;
	public Integer userTypeInsert(WhUserType u) {
		return (Integer) ht.save(u);
	}

	public void userTypeUpdate(WhUserType u) {

		ht.update(u);
	}

	public void userTypeDelete(Integer id) {

		WhUserType u=new WhUserType();
		u.setId(id);
		ht.delete(u);
	}

	public WhUserType getOneUserType(Integer id) {
		return ht.get(WhUserType.class, id);
	}

	public List<WhUserType> getAllUserTypes() {
		return ht.loadAll(WhUserType.class);
	}

	public List<WhUserType> getUserTypeByType(String type) {

		String hql="from "+WhUserType.class.getName()+" where type=?";
		
		@SuppressWarnings("unchecked")
		List<WhUserType> list=(List<WhUserType>) ht.findByCriteria(DetachedCriteria.forClass(WhUserType.class).add(Restrictions.eq("type", type))
				);
		return list;
	}

	public boolean isUserTypeEmailExist(String mail) {
		@SuppressWarnings("unchecked")
		List<Long> count=(List<Long>)ht.findByCriteria(DetachedCriteria.forClass(WhUserType.class).setProjection( Projections.rowCount()).add(Restrictions.eq("email", mail)));
		
		return count.get(0)!=0?true:false;
	}

	@Override
	public boolean isUserCustConnectedWithItem(Integer id) {
		@SuppressWarnings("unchecked")
		List<Long> count=(List<Long>)ht.findByCriteria(DetachedCriteria.forClass(Item.class).setProjection( Projections.rowCount()).add(Restrictions.eq("id", id)));
		
		return count.get(0)!=0?true:false;
	}
	
	
}
