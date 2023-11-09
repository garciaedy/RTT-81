package com.garcia.abcincproject.daointeface;

import com.garcia.abcincproject.model.Customer;
import com.garcia.abcincproject.model.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class CustomerDao implements CustomerDao {
	
	 private SessionFactory sessionFactory; 

	    public List<Customer> getAllCustomers() {
	        Session currentSession = sessionFactory.getCurrentSession();
	        Query<Customer> theQuery = currentSession.createQuery("from Customer", Customer.class);
	        List<Customer> customers = theQuery.getResultList();
	        return customers;
	    }

	    
	    public Customer getCustomerByEmail(String email) {
	        Session currentSession = sessionFactory.getCurrentSession();
	        Query<Customer> theQuery = currentSession.createQuery("from Customer where email=:email", Customer.class);
	        theQuery.setParameter("email", email);
	        Customer customer = theQuery.uniqueResult();
	        return customer;
	    }

	    public List<Order> getCustomerOrders(int customerId) {
	        Session currentSession = sessionFactory.getCurrentSession();
	        Customer customer = currentSession.get(Customer.class, customerId);
	        return customer.getOrders();
	    }
	}