package com.ems.service.impl;

import com.ems.entity.User;
import com.ems.mapper.UserMapper;
import com.ems.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void register(User user) {
        user.setId(UUID.randomUUID().toString());
        userMapper.register(user);
    }

    @Override
    public User login(String username, String password) {
        return userMapper.login(username,password);
    }
}
