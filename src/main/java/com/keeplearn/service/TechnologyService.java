/**
 * 
 */
package com.keeplearn.service;

import java.util.List;
import java.util.Map;

import com.keeplearn.entity.QuizTechModel;

/**
 * @author santosh.chourasiya
 *
 */
public interface TechnologyService {

	public QuizTechModel addNewTechnology(QuizTechModel model);
	public Map<Integer, String> getAllTechnology();
	public List<QuizTechModel> getTechnologyList();
	public String getTechnology(int id);
	
}
