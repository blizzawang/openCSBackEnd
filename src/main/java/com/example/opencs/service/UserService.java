package com.example.opencs.service;
import com.example.opencs.model.User;

/**
 * @author wuliang
 * @date 2021/8/19
 */
public interface UserService {

    // 根据用户名查找用户
    User selectByUserName(String name);
    // 根据邮箱查找用户
    User selectByUserEmail(String email);
    // 根据手机号查找用户
    User selectByUserPhone(Integer phone);
    //通过邮箱登录/注册用户
    User addUserWithEmail(String email);
    //通过电话号码登录/注册用户
    User addUserWithPhone(Integer phone);
    User TestCreateUser(String email,String password,String name,Integer phone);
}
