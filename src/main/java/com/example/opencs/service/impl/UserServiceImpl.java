package com.example.opencs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.opencs.mapper.UserMapper;
import com.example.opencs.model.User;
import com.example.opencs.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author wuliang
 * @date 2021/8/19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
