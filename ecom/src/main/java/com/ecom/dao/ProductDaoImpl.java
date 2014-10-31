package com.ecom.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import ecom.entity.Product;

public class ProductDaoImpl extends HibernateUtil implements ProductDao {

	public Product getProduct(Integer id ) {
		Session session = getCurrentSession();
		Query query = session.createQuery("from Product  where product.id=:id");
		query.setInteger("id", id);

		return getProduct(id);
	}

	@SuppressWarnings({ "unchecked", "unused" })
	public List<Product> getProducts(Integer start,Integer count) {
		Session session = getCurrentSession();
		Query query = session.createQuery("from Product");
		List<Product> product = query.list();

		query.setFirstResult(start);
		query.setMaxResults(count);
		
	
		return query.list();
	}

}
