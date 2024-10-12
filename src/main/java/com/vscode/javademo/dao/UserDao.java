package com.vscode.javademo.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vscode.javademo.entity.User;

public interface UserDao extends BaseMapper<User> {
    List<User> getUserList();
}
