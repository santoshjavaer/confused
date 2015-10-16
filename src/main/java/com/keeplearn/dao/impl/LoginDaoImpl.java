/**
 * 
 */
package com.keeplearn.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.keeplearn.dao.LoginDao;
import com.keeplearn.entity.Users;



@Repository("loginDao")
public class LoginDaoImpl implements LoginDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Users findByUserName(String username) {

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Users user = (Users)session.get(Users.class, username);
		transaction.commit();
		return user;
	
	}

}
