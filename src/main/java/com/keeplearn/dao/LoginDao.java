/**
 * 
 */
package com.keeplearn.dao;

import com.keeplearn.entity.Users;


/**
 * @author santosh.chourasiya
 *
 */
public interface LoginDao {
	
	Users findByUserName(String username);
}
