package com.keeplearn.model;

public class UserServiceBean {
	private String userId;
	private String userName;
	private String userEmail;
	private char[] userPassword;
	private char[] userComfirmPassword;
	
	
	public UserServiceBean() {
	}
	
	public UserServiceBean(String userId, String userName, String userEmail,
			char[] userPassword, char[] userComfirmPassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userComfirmPassword = userComfirmPassword;
	}


	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public char[] getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(char[] userPassword) {
		this.userPassword = userPassword;
	}
	public char[] getUserComfirmPassword() {
		return userComfirmPassword;
	}
	public void setUserComfirmPassword(char[] userComfirmPassword) {
		this.userComfirmPassword = userComfirmPassword;
	}
	
}
