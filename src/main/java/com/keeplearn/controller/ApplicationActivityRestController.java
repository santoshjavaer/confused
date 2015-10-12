/**
 * 
 */
package com.keeplearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.keeplearn.entity.QuizTopicModel;
import com.keeplearn.service.TopicService;

/**
 * @author santosh
 *
 */

@Controller
@RequestMapping(value="/auth")
public class ApplicationActivityRestController {
	
	@Autowired
	TopicService topicService;
	
	@RequestMapping(value="/topic/{technologyId}", method = RequestMethod.POST, headers="Accept=application/json")
	public List<QuizTopicModel> getTopic(@PathVariable int technologyId){
		System.out.println("HTTP HIT FOR TOPIC DONE SUCCESSFULLY. WITH ID "+technologyId);
		List<QuizTopicModel> quizeTechTopicModels = topicService.getAllTopic(technologyId);
		System.out.println("Data of Topic : "+quizeTechTopicModels);
		return quizeTechTopicModels;
	}
	
}
