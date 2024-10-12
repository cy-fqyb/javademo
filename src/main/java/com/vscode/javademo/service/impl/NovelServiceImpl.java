package com.vscode.javademo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vscode.javademo.dao.NovelDao;
import com.vscode.javademo.entity.Novel;
import com.vscode.javademo.service.NovelService;

@Service
public class NovelServiceImpl extends ServiceImpl<NovelDao, Novel> implements NovelService {

    @Autowired
    private NovelDao novelDao;

    @Override
    public String addNovel(Novel novel) {
        int result = novelDao.insert(novel);
        if (result > 0) {
            return "添加成功";
        } else {
            return "添加失败";
        }
    }

}
