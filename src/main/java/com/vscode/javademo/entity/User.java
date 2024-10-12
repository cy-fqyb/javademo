package com.vscode.javademo.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class User {
    private String id;
    private String name;
    private Integer age;
    private String account;
    private String password;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
