package com.keeplearn.model;


public class CommonQuestionModel {
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private int technologyId;
	
	private int topicId;
	
	private String questions;
	
	private String options;
	
	private String answer;
	
	private int questionSet;
	
	private String seriesName;
	
	private int seriesId;
	
	private String technologyName;
	
	private String action;
	

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTechnologyId() {
		return technologyId;
	}

	public void setTechnologyId(int technologyId) {
		this.technologyId = technologyId;
	}

	public int getTopicId() {
		return topicId;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public String getQuestions() {
		return questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getQuestionSet() {
		return questionSet;
	}

	public void setQuestionSet(int questionSet) {
		this.questionSet = questionSet;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public int getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(int seriesId) {
		this.seriesId = seriesId;
	}

	public String getTechnologyName() {
		return technologyName;
	}

	public void setTechnologyName(String technologyName) {
		this.technologyName = technologyName;
	}
	
	
}
