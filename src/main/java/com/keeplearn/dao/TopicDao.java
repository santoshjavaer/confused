/**
 * 
 */
package com.keeplearn.dao;

import java.util.List;

import com.keeplearn.entity.QuizTopicModel;

/**
 * @author santosh.chourasiya
 *
 */
public interface TopicDao {
	
	public QuizTopicModel addNewQuizTopic(QuizTopicModel quizeTechTopicModel);
	public List<QuizTopicModel> getAllTopic(int technologyId);
	public List<QuizTopicModel> getTopicList();
}
