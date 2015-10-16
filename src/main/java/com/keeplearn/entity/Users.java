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
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author santosh.chourasiya
 *
 */
@Entity
@Table(name = "user_details")
public class Users implements Serializable{

	private static final long serialVersionUID = 3834806595485570871L;

	@Id
	@Column(name="username")
	private String username;

	@Column(name = "password")
	private String password;
	
	@Column(name = "enabled")
	private boolean enabled;
	
	@OneToMany(mappedBy = "user" , fetch = FetchType.LAZY)
	private Set<UserRole> roles = new HashSet<UserRole>();

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public Set<UserRole> getRoles() {
		return roles;
	}
	public void setRoles(Set<UserRole> roles) {
		this.roles = roles;
	}
}
