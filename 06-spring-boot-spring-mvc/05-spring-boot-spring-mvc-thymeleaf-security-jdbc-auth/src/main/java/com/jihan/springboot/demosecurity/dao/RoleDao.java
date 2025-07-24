package com.jihan.springboot.demosecurity.dao;

import com.jihan.springboot.demosecurity.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
