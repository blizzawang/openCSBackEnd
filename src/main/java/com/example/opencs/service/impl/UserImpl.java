package com.example.opencs.service.impl;

import com.example.opencs.mapper.UserMapper;
import com.example.opencs.model.User;
import com.example.opencs.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.sql.Timestamp;

/**
 * @author wuliang
 * @date 2021/8/19
 */
@Service
public class UserImpl implements UserService {

    private UserMapper userMapper;

    @Override
    public User selectByUserName(String name) {
        return null;
    }

    @Override
    public User selectByUserEmail(String email) {
        return null;
    }

    @Override
    public User selectByUserPhone(Integer phone) {
        return null;
    }

    @Override
    public User addUserWithEmail(String email) {
        return null;
    }

    /**
     * 注册创建用户
     * @param email
     * @return
     */

    @Override
    public User TestCreateUser(String email,String password,String name,Integer phone) {
        Date date = new Date();
       User user = new User();
       user.setUserEmail(email);
       user.setUserId(1);
       user.setUserName(name);
       user.setUserPhone(phone);
       user.setUserPasssword(password);
       Timestamp timestamp = new Timestamp(date.getTime());
       user.setGmtCreate(timestamp);
       user.setGmtModified(timestamp);
       return user;
    }

    @Override
    public User addUserWithPhone(Integer phone) {
        return null;
    }
}
