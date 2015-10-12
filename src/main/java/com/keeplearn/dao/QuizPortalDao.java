package com.keeplearn.dao;




/**
 * @author santosh.chourasiya
 *
 */
public interface QuizPortalDao {
	
	public long getMaxSetNumber();
	public long getQuestionNumberOfMaxSet(long setNumber);
	public Object createQuizSet(Object object);
	
}
