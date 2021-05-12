package com.ems.service;

import com.ems.entity.User;

public interface UserService {
    void register(User user);
    User login(String username,String password);
}
