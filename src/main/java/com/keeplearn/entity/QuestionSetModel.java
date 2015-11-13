package com.keeplearn.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "question_set")
public class QuestionSetModel implements Serializable {

	private static final long serialVersionUID = 7824604770710451788L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="series_id")
	private int id;
	
	@Column(name="series_name")
	private String seriesName;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="user_id")
	private String userId;
	
	@ManyToOne
	@JoinColumn(name="topic_id")
	private QuizTopicModel quizTopicModel;
	

	
	@ManyToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	@JoinTable(
			name = "question_set_mapping",
			joinColumns = {@JoinColumn(name = "series_id" , nullable = false , updatable = false) },
			inverseJoinColumns = {@JoinColumn(name = "question_id" , nullable = false, updatable = false)}
			)
	private Set<QuestionModel> questionModelSet = new HashSet<QuestionModel>();

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSeriesName() {
		return seriesName;
	}
	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public QuizTopicModel getQuizTopicModel() {
		return quizTopicModel;
	}
	public void setQuizTopicModel(QuizTopicModel quizTopicModel) {
		this.quizTopicModel = quizTopicModel;
	}
	public Set<QuestionModel> getQuestionModelSet() {
		return questionModelSet;
	}
	public void setQuestionModelSet(Set<QuestionModel> questionModelSet) {
		this.questionModelSet = questionModelSet;
	}

	@Override
	public String toString() {
		return "QuestionSetModel [id=" + id + ", seriesName=" + seriesName
				+ ", date=" + date + ", userId=" + userId + ", quizTopicModel="
				+ quizTopicModel + ", questionModelSet=" + questionModelSet
				+ "]";
	}

}

