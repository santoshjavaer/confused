/**
 * 
 */
package com.keeplearn.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author santosh
 *
 */
@Entity
@Table(name="question")
public class QuestionModel implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="question_id")
	private int id;
	
	@Column(name="questions")
	private String questions;
	
	@Column(name="question_options")
	private String options;
	
	@Column(name="answer")
	private String answer;

	@ManyToMany(mappedBy = "questionModelSet" , fetch = FetchType.LAZY)
	private Set<QuestionSetModel> questionSetModel = new HashSet<QuestionSetModel>();
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Set<QuestionSetModel> getQuestionSetModel() {
		return questionSetModel;
	}
	public void setQuestionSetModel(Set<QuestionSetModel> questionSetModel) {
		this.questionSetModel = questionSetModel;
	}

	@Override
	public String toString() {
		return "QuestionModel [id=" + id + ", questions=" + questions
				+ ", options=" + options + ", answer=" + answer
				+ ", questionSetModel=" + questionSetModel + "]";
	}
	
}
