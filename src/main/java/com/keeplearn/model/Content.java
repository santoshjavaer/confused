package com.keeplearn.model;

public class Content {
	private int id;
	private String image_name;
	private String image_description;
	private String image_url;
	
	@Override
	public String toString() {
		return "Content [id=" + id + ", image_name=" + image_name
				+ ", image_description=" + image_description + ", image_url="
				+ image_url + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImage_name() {
		return image_name;
	}
	public void setImage_name(String image_name) {
		this.image_name = image_name;
	}
	public String getImage_description() {
		return image_description;
	}
	public void setImage_description(String image_description) {
		this.image_description = image_description;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	
	
}
