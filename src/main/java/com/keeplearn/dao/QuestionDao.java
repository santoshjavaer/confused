/**
 * 
 */
package com.keeplearn.dao;

import java.util.List;

import com.keeplearn.entity.QuestionModel;

/**
 * @author santosh.chourasiya
 *
 */
public interface QuestionDao {
	
	public QuestionModel uploadQuestion(QuestionModel questionModel);
	
	public QuestionModel updateQuestion(QuestionModel questionModel);
	
	public void deleteQuestion(Integer questionId);
	
	public List<QuestionModel> getQuestionList(Integer topicId);
	
}
