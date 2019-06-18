package com.app.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IOrderMethodDao;
import com.app.model.Item;
import com.app.model.OrderMethod;
@Repository
public class OrderMethodDaoImpl implements IOrderMethodDao {
	@Autowired
	private HibernateTemplate ht;

	public Integer saveOrders(OrderMethod or) {
		return (Integer) ht.save(or);
	}

	public void updateOrders(OrderMethod or) {

		ht.update(or);
	}


	public void deleteOrders(Integer id) {
		OrderMethod or=new OrderMethod();
		or.setId(id);
		ht.delete(or);
	}

	public OrderMethod getOneOrderById(Integer id) {
		return ht.get(OrderMethod.class,id);
	}

	public List<OrderMethod> getAllOrders() {
		return ht.loadAll(OrderMethod.class);
	}

	@Override
	public List<OrderMethod> getOrderMethodByMode(String mode) {


		//	String hql="from "+OrderMethod.class.getName()+" where mode=?";

		@SuppressWarnings("unchecked")
		List<OrderMethod> oms=(List<OrderMethod>) ht.findByCriteria(DetachedCriteria.forClass(OrderMethod.class).add(Restrictions.eq("mode", mode))) ;
		return oms;
	}


	public boolean isOrderConnectedWithItem(Integer id) {

		@SuppressWarnings("unchecked")
		List<Long> count=(List<Long>)ht.findByCriteria(DetachedCriteria.forClass(Item.class).setProjection(Projections.rowCount())
				.add(Restrictions.eq("saleType.id", id))
				);

		return count.get(0)!=0?true:false;
	}

	public boolean isOrderPurchaseConnectedWithItem(Integer id) {
		@SuppressWarnings("unchecked")
		List<Long> count=(List<Long>)ht.findByCriteria(DetachedCriteria.forClass(Item.class).setProjection(Projections.rowCount())
				.add(Restrictions.eq("purchaseType.id", id))
				);

		return count.get(0)!=0?true:false;
	}

}
