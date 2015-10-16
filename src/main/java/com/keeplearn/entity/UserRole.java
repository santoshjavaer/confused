/**
 * 
 */
package com.keeplearn.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author santosh.chourasiya
 *
 */
@Entity
@Table(name = "user_roles")
public class UserRole implements Serializable {

	private static final long serialVersionUID = -7925356048483790310L;

	@Id
	@GeneratedValue
	@Column(name = "user_role_id")
	private Integer id;
	
	@Column(name = "user_role" , nullable = false)
	private String role;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "username" , nullable = false)
	private Users user;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserRole [id=" + id + ", role=" + role + ", user=" + user + "]";
	}
	
}