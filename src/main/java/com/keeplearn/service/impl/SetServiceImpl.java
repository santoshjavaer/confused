/**
 * 
 */
package com.keeplearn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keeplearn.dao.SetDao;
import com.keeplearn.entity.QuestionSetModel;
import com.keeplearn.service.SetService;

@Service("setService")
public class SetServiceImpl implements SetService {
	
	@Autowired
	private SetDao setDao;
	
	@Override
	public QuestionSetModel createSet(QuestionSetModel questionSetModel) {
		return setDao.createSet(questionSetModel);
	}

}
