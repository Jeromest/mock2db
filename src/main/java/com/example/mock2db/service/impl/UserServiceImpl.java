package com.example.mock2db.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mock2db.entity.User;
import com.example.mock2db.mapper.UserMapper;
import com.example.mock2db.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
