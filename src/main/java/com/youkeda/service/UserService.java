package com.youkeda.service;

import com.youkeda.model.User;

/**
 * UserService
 */
public interface UserService {

    User login(String userName,String password);

}