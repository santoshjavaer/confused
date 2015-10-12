/**
 * 
 */
package com.keeplearn.dao.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.keeplearn.dao.QuizPortalDao;
import com.keeplearn.entity.QuestionModel;
import com.keeplearn.entity.QuizTechModel;


/**
 * @author santosh.chourasiya
 *
 */
@Component
public class QuizPortalDaoImpl implements QuizPortalDao {

	@Autowired
	SessionFactory sessionFactory;
	
	
	
	
	private Map<Integer, String> listToMap(List<QuizTechModel> models){
		
		Map<Integer, String> technology = new HashMap<Integer, String>();
		
		for(QuizTechModel qm : models){
			technology.put(qm.getId(), qm.getTechnologyName());
		}
		return technology;
	}
	
	
	
	
	/*private Map<Integer, String> listToMap(List<? extends SuperModel> models){
		
		Map<Integer, String> technology = new HashMap<Integer, String>();
		
		
		SuperModel superModel = models.get(0);
		
		if(superModel instanceof QuizTechModel){
			for(SuperModel sm : models){
				
				technology.put(sm.getId(), sm.getTechnologyName());
			}
		}
		else{
			for(SuperModel sm : models){
				
				technology.put(sm.getId(), sm.getTopicName());
			}
		}
		
		
		return technology;
	}
	*/
	

/*	
	public JavaTechnologyModel uploadQuestion(JavaTechnologyModel javaTechnologyModel) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(javaTechnologyModel);
		tx.commit();
		Serializable serializable = session.getIdentifier(javaTechnologyModel);
		javaTechnologyModel.setId((Integer)serializable);
		session.close();
		return javaTechnologyModel;
	}*/
		

	
	@SuppressWarnings("unchecked")
	public List<QuestionModel> getQuestion(int topicId) {
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		List<QuestionModel> javaTechnologyModel = null;
		
		javaTechnologyModel = session.createCriteria(QuestionModel.class).add(Restrictions.eq("topicId", topicId)).list();
		tx.commit();
		return javaTechnologyModel;
	}
	

	
	/*   ============================== This method to find max set number ========================*/
	
	public long getMaxSetNumber(){
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(QuestionModel.class).setProjection(Projections.max("questionSet"));
		Integer maxValue = (Integer)criteria.uniqueResult();
		transaction.commit();
		return maxValue == null ? 0 : maxValue;
	}
	
	
	/* ============================== This method to find no of question in max set ===================== */
	
	public long getQuestionNumberOfMaxSet(long setNumber){
		
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		String hql = "select count(id) from JavaTechnologyModel where questionSet="+setNumber;
		Query query = session.createQuery(hql);
		Long noOfQuestion = (Long)query.uniqueResult();
		transaction.commit();
		
		return noOfQuestion;
	}
	
	@Override
	public Object createQuizSet(Object object) {

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(object);
		tx.commit();
		Serializable serializable = session.getIdentifier(object);
		session.close();
		return serializable;
	}
	
	
}
