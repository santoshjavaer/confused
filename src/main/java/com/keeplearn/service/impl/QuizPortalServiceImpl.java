/**
 * 
 */
package com.keeplearn.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keeplearn.dao.impl.QuizPortalDaoImpl;
import com.keeplearn.entity.QuestionSetModel;
import com.keeplearn.model.CommonQuestionModel;
import com.keeplearn.service.QuizPortalService;
import com.keeplearn.util.CommonUtilServices;

/**
 * @author santosh.chourasiya
 *
 */
@Service
public class QuizPortalServiceImpl implements QuizPortalService {

	@Autowired
	QuizPortalDaoImpl quizPortalDao;
	@Autowired
	CommonUtilServices commonUtilServices;

	
	@Override
	public CommonQuestionModel createQuizSet( CommonQuestionModel commonQuestionModel) {
		
		Object object = commonUtilServices.modelMapper(commonQuestionModel, QuestionSetModel.class); 
		Serializable serializable = (Serializable)quizPortalDao.createQuizSet(object);
		commonQuestionModel.setSeriesId((Integer)serializable);
		//commonQuestionModel.setTechnologyName(getTechnology(commonQuestionModel.getTechnologyId()));
		
		return commonQuestionModel;
	}
	
}
