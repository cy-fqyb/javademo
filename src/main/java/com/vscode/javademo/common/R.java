package com.vscode.javademo.common;

import lombok.Data;

/**
 * 返回前端的结果类
 * 
 * @author cyfqyb
 * @date 2023/9/5 20:24
 * @version 1.0
 */
@Data
public class R<T> {
    private Integer code;
    private T data;
    private String msg;

    public static <T> R<T> success(T data, String msg) {
        R<T> r = new R<T>();
        r.data = data;
        r.code = 1;
        r.msg = msg;
        return r;
    }

    public static <T> R<T> success(String msg) {
        R<T> r = new R<T>();
        r.data = null;
        r.code = 1;
        r.msg = msg;
        return r;
    }

    public static <T> R<T> err(String msg) {
        R<T> r = new R<T>();
        r.data = null;
        r.code = 0;
        r.msg = msg;
        return r;
    }
}
