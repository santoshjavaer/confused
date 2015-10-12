/**
 * 
 */
package com.keeplearn.dao.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.keeplearn.dao.TechnologyDoa;
import com.keeplearn.entity.QuizTechModel;

/**
 * @author santosh.chourasiya
 *
 */
@Repository("quizTechDoa")
public class TechnologyDaoImpl implements TechnologyDoa {

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public QuizTechModel addNewTechnology(QuizTechModel model) {
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(model);
		tx.commit();
		Serializable serializable  = session.getIdentifier(model);
		model.setId((Integer)serializable);
		session.close();
		return model;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Map<Integer, String> getAllTechnology() {
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		List<QuizTechModel> models = session.createCriteria(QuizTechModel.class).list();
		tx.commit();
		return listToMap(models);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<QuizTechModel> getTechnologyList() {
		
		Session session = sessionFactory.openSession();
		Transaction transaction =  session.beginTransaction();
		List<QuizTechModel> models = session.createCriteria(QuizTechModel.class).list();
		transaction.commit();
		return models;
		
	}

	@Override
	public String getTechnology(int id) {
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		String hql = "select technologyName from QuizTechModel where id = "+id;
		Query query = session.createQuery(hql);
		String technologyName = (String)query.uniqueResult();
		transaction.commit();
		return technologyName;
	}
	
	
	
	private Map<Integer, String> listToMap(List<QuizTechModel> models){
		
		Map<Integer, String> technology = new HashMap<Integer, String>();
		
		for(QuizTechModel qm : models){
			technology.put(qm.getId(), qm.getTechnologyName());
		}
		return technology;
	}

}
