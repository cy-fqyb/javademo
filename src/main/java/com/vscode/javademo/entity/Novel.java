package com.vscode.javademo.entity;

import lombok.Data;
import java.time.LocalDate;

import jakarta.persistence.Lob;

@Data
public class Novel {
    private Long novelId; // 小说ID
    private String title; // 小说标题
    private String author; // 作者
    private String category; // 小说类别
    private String status; // 小说状态
    private String description; // 小说简介
    private Integer wordCount; // 字数
    private LocalDate publicationDate; // 发表日期
    private LocalDate lastUpdate; // 最后更新时间
    private Double rating; // 评分
    private Integer views; // 浏览次数
    private Integer likes; // 点赞数
    private String coverImageUrl; // 封面图片URL
    private String language; // 语言
    private String publisher; // 出版社
    private Boolean isDeleted; // 逻辑删除标记
    @Lob
    private String content; // 小说内容
}
