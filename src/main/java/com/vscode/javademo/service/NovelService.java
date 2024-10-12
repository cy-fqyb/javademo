package com.vscode.javademo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vscode.javademo.entity.Novel;

public interface NovelService extends IService<Novel> {
    String addNovel(Novel novel);
}
