/**
 * 
 */
package com.keeplearn.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.keeplearn.dao.TopicDao;
import com.keeplearn.entity.QuizTopicModel;

/**
 * @author santosh.chourasiya
 *
 */
@Repository("topicDao")
public class TopicDaoImpl implements TopicDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public QuizTopicModel addNewQuizTopic(QuizTopicModel quizTopicModel) {
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(quizTopicModel);
		tx.commit();
		Serializable serializable  = session.getIdentifier(quizTopicModel);
		quizTopicModel.setId((Integer)serializable);
		session.close();
		return quizTopicModel;
	}

	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<QuizTopicModel> getAllTopic(int technologyId) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		List<QuizTopicModel> models = null;
		try{
			models = session.createCriteria(QuizTopicModel.class).add(Restrictions.eq("technologyId", technologyId)).list();
			tx.commit();
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return models;
	}

	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<QuizTopicModel> getTopicList() {
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		List<QuizTopicModel> topicModels = null;
		
		try{
			topicModels = session.createCriteria(QuizTopicModel.class).list();
			transaction.commit();
		}catch(Exception exception){
			exception.printStackTrace();
		}
		
		return topicModels;
	}
	
}
