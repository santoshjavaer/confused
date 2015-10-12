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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import com.keeplearn.model.CommonAdaptor;

/**
 * @author santosh.chourasiya
 *
 */

@Entity
@Table(name="technology")
public class QuizTechModel extends CommonAdaptor implements Serializable{
	
	private static final long serialVersionUID = -3040755234225619752L;
	
	@Id
	@GeneratedValue
	@Column(name="tech_id")
	private int id;
	
	@Column(name="tech_name" , unique=true)
	private String technologyName;
	
	@Transient
	private MultipartFile multipartFile;
	
	@Column(name="image_name")
	private String imageName;
	
	@Column(name="short_detail")
	private String shortDetails;

	@OneToMany(mappedBy="technology" , fetch = FetchType.LAZY)
	private Set<QuizTopicModel> quizTopicModels = new HashSet<QuizTopicModel>();
	
	public QuizTechModel() {}

	/**
	 * @param id
	 * @param technologyName
	 * @param actionURL
	 * @param imageURL
	 * @param shortDetails
	 */
	public QuizTechModel(int id, String technologyName,
			MultipartFile multipartFile, String shortDetails , String imageName) {
		super();
		this.id = id;
		this.technologyName = technologyName;
		this.multipartFile = multipartFile;
		this.shortDetails = shortDetails;
		this.imageName = imageName;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTechnologyName() {
		return technologyName;
	}

	public void setTechnologyName(String technologyName) {
		this.technologyName = technologyName;
	}

	public MultipartFile getImageURL() {
		return multipartFile;
	}

	public void setImageURL(MultipartFile multipartFile) {
		this.multipartFile = multipartFile;
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

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public Set<QuizTopicModel> getQuizTopicModels() {
		return quizTopicModels;
	}

	public void setQuizTopicModels(Set<QuizTopicModel> quizTopicModels) {
		this.quizTopicModels = quizTopicModels;
	}

	@Override
	public String toString() {
		return "QuizTechModel [id=" + id + ", technologyName=" + technologyName
				+ ", multipartFile=" + multipartFile + ", imageName="
				+ imageName + ", shortDetails=" + shortDetails
				+ ", quizTopicModels=" + quizTopicModels + "]";
	}
	
}
