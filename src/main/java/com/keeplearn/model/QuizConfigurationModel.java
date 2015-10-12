/**
 * 
 */
package com.keeplearn.model;

/**
 * @author santosh.chourasiya
 *
 */
public class QuizConfigurationModel {
	
	private String title;
	private String question;
	private String time;
	private String startButtonName;
	
	public QuizConfigurationModel() {}

	/**
	 * @param title
	 * @param question
	 * @param time
	 * @param startButtonName
	 */
	public QuizConfigurationModel(String title, String question, String time,
			String startButtonName) {
		super();
		this.title = title;
		this.question = question;
		this.time = time;
		this.startButtonName = startButtonName;
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getStartButtonName() {
		return startButtonName;
	}

	public void setStartButtonName(String startButtonName) {
		this.startButtonName = startButtonName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("QuizConfigurationModel [title=");
		builder.append(title);
		builder.append(", question=");
		builder.append(question);
		builder.append(", time=");
		builder.append(time);
		builder.append(", startButtonName=");
		builder.append(startButtonName);
		builder.append("]");
		return builder.toString();
	}
	
}
