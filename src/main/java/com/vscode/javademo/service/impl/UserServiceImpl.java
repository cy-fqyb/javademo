package com.vscode.javademo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vscode.javademo.dao.UserDao;
import com.vscode.javademo.entity.User;
import com.vscode.javademo.service.UserService;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserList() {
        // return userDao.selectList(null);
        return userDao.getUserList();
    }
}
