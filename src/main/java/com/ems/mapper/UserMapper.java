package com.ems.mapper;

import com.ems.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PostMapping;

public interface UserMapper {
    void register(User user);
    User login(@Param("username") String username, @Param("password") String password);
}
