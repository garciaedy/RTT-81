package com.garcia.hibernateuser.controller;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.garcia.hibernateuser.model.User;
import com.garcia.hibernateuser.util.HibernateUtil;

public class HibernateQueryLang {
	
	/** 
	 *ORDER BY Clause:To sort your HQL query results, you will need to use the ORDER BY clause. 
	 *You can order the results by any property on the objects in the result set (ascending [ASC] or
	 * descending [DESC]). Following is the simple syntax of using ORDER BY clause:

	 */
	
	/*
	 * 
	 */
	
	public void useFromClause() {
		Session session = HibernateUtil.getConnection();
        // HQL query
		String hql = "FROM User";
//		TypedQuery<User> query = session.createQuery(hql, User.class);
        // Create a TypedQuery
		TypedQuery<User> query = session.createQuery(hql, User.class);
        // Execute query and get result list
		List<User> results = query.getResultList();
        // Process the results
		for(User u: results) {
			System.out.println("User Id: " + u.getId() + " |" + "Full Name: " + u.getFullName() + " |" + "Email: " + u.getEmail()+ " |" + "Password: "+ u.getPassword());
		}
		
	}
	
	

}
