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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import com.keeplearn.model.CommonAdaptor;

/**
 * @author santosh
 *
 */
@Entity
@Table(name="technology_topic")
public class QuizTopicModel extends CommonAdaptor implements Serializable{

	private static final long serialVersionUID = 1570848934599013413L;
	@GeneratedValue
	@Id
	@Column(name="topic_id")
	private int id;
	
	@Column(name="topic_name")
	private String topicName;
	
	@Column(name="topic_image")
	private String topicImage;
	
	@Column(name="topic_detail")
	private String shortDetails;
	
	@Transient
	private MultipartFile multipartFile;
	
	@ManyToOne
	@JoinColumn(name="tech_id")
	private QuizTechModel technology;
	
	
	@OneToMany(mappedBy="quizTopicModel" , fetch = FetchType.LAZY)
	private Set<QuestionSetModel> questionSetModels = new HashSet<QuestionSetModel>();
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getTopicImage() {
		return topicImage;
	}
	public void setTopicImage(String topicImage) {
		this.topicImage = topicImage;
	}
	
	public String getShortDetails() {
		return shortDetails;
	}
	public void setShortDetails(String shortDetails) {
		this.shortDetails = shortDetails;
	}
	public MultipartFile getMultipartFile() {
		return multipartFile;
	}
	public void setMultipartFile(MultipartFile multipartFile) {
		this.multipartFile = multipartFile;
	}
	
	public QuizTechModel getTechnology() {
		return technology;
	}
	public void setTechnology(QuizTechModel technology) {
		this.technology = technology;
	}
	public Set<QuestionSetModel> getQuestionSetModels() {
		return questionSetModels;
	}
	public void setQuestionSetModels(Set<QuestionSetModel> questionSetModels) {
		this.questionSetModels = questionSetModels;
	}
	@Override
	public String toString() {
		return "QuizTopicModel [id=" + id + ", topicName=" + topicName
				+ ", topicImage=" + topicImage + ", shortDetails="
				+ shortDetails + ", multipartFile=" + multipartFile
				+ ", technology=" + technology + ", questionSetModels="
				+ questionSetModels + "]";
	}

}
