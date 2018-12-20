package com.clare.service;

import com.clare.domain.Pr_user;
import com.clare.mapper.Pr_userMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class Pr_userService {
    @Resource
    private Pr_userMapper userMapper;

    public Pr_user getUserById(long id) {
        return userMapper.getById(id);
    }

    public Pr_user updateNickNameById(long id, Pr_user user) {
        user.setUser_id(id);
        userMapper.updateNickNameById(user);
        return userMapper.getById(id);
    }
}
