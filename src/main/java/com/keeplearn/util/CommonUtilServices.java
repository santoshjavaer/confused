package com.keeplearn.util;

import java.util.concurrent.atomic.AtomicLong;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.keeplearn.dao.QuizPortalDao;
import com.keeplearn.entity.QuestionModel;
import com.keeplearn.model.CommonQuestionModel;

@Component
public class CommonUtilServices {
	
	@Autowired
	QuizPortalDao quizPortalDao;

	AtomicLong atomicLong = new AtomicLong(0);

	public long getSetNumber(){
		System.out.println(quizPortalDao+" getSetNumber");
		long result;
		
		long setNumber = quizPortalDao.getMaxSetNumber();
		
		if(setNumber == 0){
			setNumber = atomicLong.incrementAndGet();
		}
		
		long questionNumber = quizPortalDao.getQuestionNumberOfMaxSet(setNumber);
		
		if(questionNumber < 4){
			result = setNumber;
		}else{
			result = atomicLong.incrementAndGet();
		}
		
		System.out.println("returning set : "+result);
		
		return result;
	}
	
	
	
	
	
	public Object modelMapper(CommonQuestionModel commonQuestionModel){
		
		ModelMapper modelMapper = new ModelMapper();
		Class<?> destinationType = null;
		
		switch(commonQuestionModel.getTechnologyId()){
			case 1: {
				destinationType = QuestionModel.class;
				break;
			}
			case 7: {
				//destinationType = JQueryTechnolModel.class;
				break;
			}
			
			default:{
				break;
			}
		}
		
	  return modelMapper.map(commonQuestionModel, destinationType);
		
	}
	
	@SuppressWarnings("unchecked")
	public Object modelMapper(CommonQuestionModel source , Class destination){
		
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(source, destination);
		
	}
	
	
}
