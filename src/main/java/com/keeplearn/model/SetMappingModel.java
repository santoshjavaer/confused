package com.keeplearn.model;

public class SetMappingModel {
	
	private int setId;
	private int topicId;
	private int technologyId;
	private String setName;
	
	public int getTechnologyId() {
		return technologyId;
	}
	public void setTechnologyId(int technologyId) {
		this.technologyId = technologyId;
	}
	private String setLable;
	
	public int getSetId() {
		return setId;
	}
	public void setSetId(int setId) {
		this.setId = setId;
	}
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	public String getSetName() {
		return setName;
	}
	public void setSetName(String setName) {
		this.setName = setName;
	}
	public String getSetLable() {
		return setLable;
	}
	public void setSetLable(String setLable) {
		this.setLable = setLable;
	}
}
