package com.jihan.springboot.demosecurity.service;

import com.jihan.springboot.demosecurity.entity.User;
import com.jihan.springboot.demosecurity.user.WebUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

	void save(WebUser webUser);

}
