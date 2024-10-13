package com.vscode.javademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.vscode.javademo.common.R;
import com.vscode.javademo.entity.User;
import com.vscode.javademo.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public R<List<User>> getUserList() {
        List<User> userList = userService.getUserList();
        return R.success(userList, "查询成功");
    }

    @GetMapping("/userinfo")
    public R<User> getUserInfo(String id, String name) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", id);
        queryWrapper.eq("name", name);
        User user = userService.getOne(queryWrapper);
        return R.success(user, "查询成功");
    }

    @GetMapping("/test")
    public R<String> test() {
        return R.success("添加成功");
    }
}
