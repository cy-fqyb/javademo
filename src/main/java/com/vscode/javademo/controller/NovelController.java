package com.vscode.javademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vscode.javademo.common.R;
import com.vscode.javademo.entity.Novel;
import com.vscode.javademo.service.NovelService;

@RestController
@RequestMapping("/novel")
public class NovelController {

    @Autowired
    private NovelService novelService;

    @GetMapping("/add")
    public R<String> addNovel(Novel novel) {
        String result = novelService.addNovel(novel);
        return R.success(result);
    }
}
