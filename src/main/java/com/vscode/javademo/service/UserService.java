package com.vscode.javademo.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vscode.javademo.entity.User;

public interface UserService extends IService<User> {
    List<User> getUserList();
}
