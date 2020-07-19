package com.youkeda.test;

import com.youkeda.model.Role;
import com.youkeda.model.User;
import com.youkeda.service.RoleService;
import com.youkeda.service.RoleUserService;
import com.youkeda.service.UserService;
import com.youkeda.service.impl.RoleServiceImpl;
import com.youkeda.service.impl.RoleUserServiceImpl;
import com.youkeda.service.impl.UserServiceImpl;
import java.util.List;

public class UserRoleServiceTest {

    private static RoleService roleService = new RoleServiceImpl();
    private static UserService userService = new UserServiceImpl();
    private static RoleUserService roleUserService = new RoleUserServiceImpl();

    public static void main(String[] args) {
        testRole();
        testUser();
        testRoleUser();
    }

    public static void testRole() {
        Role role = new Role();
        role.setName("admin");
        role.setDesc("系统管理员");
        roleService.addRole(role);

        role = new Role();
        role.setName("design");
        role.setDesc("设计师");
        roleService.addRole(role);

        role = new Role();
        role.setName("dev");
        role.setDesc("开发者");
        roleService.addRole(role);

        List<Role> roles = roleService.getRoles();

        Role lastRole = roles.get(roles.size() - 1);

        System.out.println(lastRole.getName() + ":" + lastRole.getDesc());
    }

    public static void testUser() {

        User user = userService.login("xihongshi", "Didi5");

        System.out.println(user.getNickName() + ":" + user.getUserName());

    }

    public static void testRoleUser(){
        User user = userService.login("niu","Niu123");
        List<Role> roles = roleService.getRoles();
        Role firstRole = roles.get(0);
        roleUserService.addUser(firstRole.getName(),user);
        System.out.println(firstRole.getName()+":"+roleUserService.getUser(firstRole.getName()).getNickName()+":"+roleUserService.getUser(firstRole.getName()).getUserName());
    }

}