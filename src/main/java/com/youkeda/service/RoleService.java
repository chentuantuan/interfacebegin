package com.youkeda.service;

        import com.youkeda.model.Role;
        import java.util.List;

/**
 * RoleService
 */
public interface RoleService {

    void addRole(Role role);

    List<Role> getRoles();

}