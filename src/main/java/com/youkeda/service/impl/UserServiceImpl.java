package com.youkeda.service.impl;

import com.youkeda.service.UserService;
import com.youkeda.model.User;
import java.util.List;
import java.util.ArrayList;

public class UserServiceImpl implements UserService {

    private static List<User> USERS = new ArrayList<>();

    static {
        User user = new User();
        user.setNickName("爱吹风的牛");
        user.setUserName("niu");
        user.setPassword("Niu123");
        USERS.add(user);

        user = new User();
        user.setNickName("我爱西红柿");
        user.setUserName("xihongshi");
        user.setPassword("Didi5");
        USERS.add(user);
    }

    public User login(String userName, String password) {

        for (User user : USERS) {
            if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

}