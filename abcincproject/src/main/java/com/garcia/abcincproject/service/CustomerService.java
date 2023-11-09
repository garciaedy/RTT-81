package com.garcia.abcincproject.service;

import java.util.List;
import com.garcia.abcincproject.model.Customer;
import com.garcia.abcincproject.model.Order;


public class CustomerService {
	 List<Customer> getAllCustomers();
	  Customer getCustomerByEmail(String email);
	   List<Order> getCustomerOrders(int customerId);
}
