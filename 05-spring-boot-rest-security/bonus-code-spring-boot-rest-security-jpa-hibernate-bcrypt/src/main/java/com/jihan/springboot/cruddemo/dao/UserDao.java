package com.jihan.springboot.cruddemo.dao;

import com.jihan.springboot.cruddemo.entity.User;

public interface UserDao {

    User findByUserName(String userName);
    
}
