/**
 * 
 */
package com.keeplearn.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.keeplearn.dao.LoginDao;
import com.keeplearn.entity.UserRole;
import com.keeplearn.entity.Users;



@Service("userDetailsService")
public class LoginServiceImpl implements UserDetailsService {

	@Autowired
	LoginDao loginDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		
		System.err.println(" ****************** CUSTOM LOGIN *************" + username);
		
		Users user = loginDao.findByUserName(username);
		
		
		if (user == null)
		      throw new UsernameNotFoundException("user not found");
		
		List<GrantedAuthority> authorities = buildUserAuthority(user.getRoles());
		
		return buildUserForAuthentication(user , authorities);
	}
	
	
	private User buildUserForAuthentication(Users users , List<GrantedAuthority> authorities){
		
		return new User(users.getUsername(),users.getPassword(), true , true, true, true, authorities);
	}
	
	
	public List<GrantedAuthority> buildUserAuthority(Set<UserRole> roles){
		
		Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
		
		for(UserRole role : roles){
			authorities.add(new SimpleGrantedAuthority(role.getRole()));
		}
		
		return new ArrayList<GrantedAuthority>(authorities);
	}

}
