/**
 * 
 */
package com.keeplearn.service;

import com.keeplearn.entity.QuestionModel;

/**
 * @author santosh.chourasiya
 *
 */
public interface QuestionService {

	public QuestionModel uploadQuestion(QuestionModel questionModel);
	
	public QuestionModel updateQuestion(QuestionModel questionModel);
	
	public void deleteQuestion(Integer questionId);
	
}
