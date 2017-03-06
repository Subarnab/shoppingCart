package com.niit.perfume.dao.impl;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.perfume.dao.CustomerOrderDao;
import com.niit.perfume.model.CustomerOrder;

@Repository
@Transactional
class CustomerOrderDaoImpl  implements CustomerOrderDao{

	  @Autowired
	    private SessionFactory sessionFactory;

	    public void addCustomerOrder(CustomerOrder customerOrder){
	        Session session = sessionFactory.getCurrentSession();
	        session.saveOrUpdate(customerOrder);
	        session.flush();
	    }
}
