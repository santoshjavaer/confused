/**
 * 
 */
package com.keeplearn.dao.impl;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Repository;

import com.keeplearn.dao.SetDao;
import com.keeplearn.entity.QuestionSetModel;
import com.keeplearn.exception.DuplicateDataException;

/**
 * @author santosh.chourasiya
 *
 */
@Repository("setDao")
public class SetDaoImpl implements SetDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public QuestionSetModel createSet(QuestionSetModel model) {

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		try{
			session.saveOrUpdate(model);
			tx.commit();
			Serializable serializable  = session.getIdentifier(model);
			model.setId((Integer)serializable);
			
		}catch(DataIntegrityViolationException dataIntegrityViolationException){
			tx.rollback();
			throw new DuplicateDataException("Duplicate Data "+dataIntegrityViolationException.getCause());
		}catch(ConstraintViolationException constraintViolationException){
			tx.rollback();
			throw new DuplicateDataException("Duplicate Data : "+constraintViolationException.getCause());
		}finally{
			session.close();
		}
		
		return model;
		
	}

}
