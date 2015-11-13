/**
 * 
 */
package com.keeplearn.dao;

import com.keeplearn.entity.QuestionSetModel;

/**
 * @author santosh.chourasiya
 *
 */
public interface SetDao {
	
	/**
	 * 
	 * @param model
	 * @return
	 */
	QuestionSetModel createSet(QuestionSetModel model);
}
