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

import com.keeplearn.dao.QuestionDao;
import com.keeplearn.entity.QuestionModel;

/**
 * @author santosh.chourasiya
 *
 */
public class QuestionDaoImpl implements QuestionDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public QuestionModel uploadQuestion(QuestionModel questionModel) {
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(questionModel);
		tx.commit();
		Serializable serializable = session.getIdentifier(questionModel);
		session.close();
		questionModel.setId((Integer)serializable);
		return questionModel;
	}

	
	@Override
	public QuestionModel updateQuestion(QuestionModel questionModel) {
		return null;
	}

	@Override
	public void deleteQuestion(Integer questionId) {
		
	}
	

	@Override
	public List<QuestionModel> getQuestionList(Integer topicId) {
		
		/*Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		List<QuestionModel> questionModels = null;
		questionModels = session.createCriteria(QuestionModel.class).add(Restrictions.eq("topicId", topicId)).list();
		tx.commit();
		return questionModels;*/
	
		return null;
	}
	
}
