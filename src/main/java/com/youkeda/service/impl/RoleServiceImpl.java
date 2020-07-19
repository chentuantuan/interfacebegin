package com.youkeda.service.impl;

import com.youkeda.service.RoleService;
import com.youkeda.model.Role;

import java.util.ArrayList;
import java.util.List;

public class RoleServiceImpl implements RoleService {
    private  static List<Role> ROLES = new ArrayList<>();
    public void addRole(Role role) {
        ROLES.add(role);
    }

    public List<Role> getRoles() {
        return ROLES;
    }
}
