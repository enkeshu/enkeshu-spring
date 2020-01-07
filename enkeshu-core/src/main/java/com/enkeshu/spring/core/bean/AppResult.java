package com.enkeshu.spring.core.bean;

import lombok.Data;

/**
 * @Author radish.zhou
 * @date 2020/1/7 14:17
 */
@Data
public class AppResult<T> {
    private String code;
    private String message;
    private T data;

    public AppResult(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public AppResult(T data) {
        this("200", "Success", data);
    }
}
