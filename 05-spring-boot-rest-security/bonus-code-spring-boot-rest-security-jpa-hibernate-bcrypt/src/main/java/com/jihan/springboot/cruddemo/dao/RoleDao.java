package com.jihan.springboot.cruddemo.dao;

import com.jihan.springboot.cruddemo.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
