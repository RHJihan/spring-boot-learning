package com.jihan.springboot.demosecurity.dao;

import com.jihan.springboot.demosecurity.entity.User;

public interface UserDao {

    User findByUserName(String userName);

    void save(User theUser);
}
