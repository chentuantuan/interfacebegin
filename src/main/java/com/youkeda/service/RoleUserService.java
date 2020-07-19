package com.youkeda.service;

import com.youkeda.model.User;

public interface RoleUserService {
    void addUser(String roleId, User user);
    User getUser(String roled);
}
