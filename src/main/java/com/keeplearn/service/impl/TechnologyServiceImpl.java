/**
 * 
 */
package com.keeplearn.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keeplearn.dao.TechnologyDoa;
import com.keeplearn.entity.QuizTechModel;
import com.keeplearn.service.TechnologyService;

/**
 * @author santosh.chourasiya
 *
 */
@Service("quizTechService")
public class TechnologyServiceImpl implements TechnologyService
{
	@Autowired
	private TechnologyDoa quizTechDoa;

	@Override
	public QuizTechModel addNewTechnology(QuizTechModel model) {
		return quizTechDoa.addNewTechnology(model);
	}

	@Override
	public Map<Integer, String> getAllTechnology() {
		return quizTechDoa.getAllTechnology();
	}

	@Override
	public List<QuizTechModel> getTechnologyList() {
		return quizTechDoa.getTechnologyList();
	}

	@Override
	public String getTechnology(int id) {
		return quizTechDoa.getTechnology(id);
	}

	
}
