/**
 * 
 */
package com.keeplearn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keeplearn.dao.TopicDao;
import com.keeplearn.entity.QuizTopicModel;
import com.keeplearn.service.TopicService;

/**
 * @author santosh.chourasiya
 *
 */
@Service("topicService")
public class TopicServiceImpl implements TopicService{

	@Autowired
	private TopicDao topicDao;
	
	@Override
	public QuizTopicModel addNewQuizTopic(QuizTopicModel quizeTechTopicModel) {
		return topicDao.addNewQuizTopic(quizeTechTopicModel);
	}

	@Override
	public List<QuizTopicModel> getAllTopic(int technologyId) {
		return topicDao.getAllTopic(technologyId);
	}
	
	@Override
	public List<QuizTopicModel> getTopicList() {
		return topicDao.getTopicList();
	}

	
}
