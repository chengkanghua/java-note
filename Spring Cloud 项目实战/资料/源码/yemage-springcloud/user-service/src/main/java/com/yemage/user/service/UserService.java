package com.yemage.user.service;

import com.yemage.user.mapper.UserMapper;
import com.yemage.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yemage
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id){

        return userMapper.selectByPrimaryKey(id);
    }
}
