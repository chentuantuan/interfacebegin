package com.youkeda.service.impl;

import com.youkeda.model.User;
import com.youkeda.model.Role;
import com.youkeda.service.RoleUserService;

import java.util.HashMap;
import java.util.Map;

public class RoleUserServiceImpl implements RoleUserService {
    private Map<String, User>USERS = new HashMap<>();

    @Override
    public void addUser(String roleId, User user) {
        USERS.put(roleId, user);

    }

    @Override
    public User getUser(String roleId) {
        return USERS.get(roleId);
    }
}
