package com.enkeshu.spring.feign.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author radish.zhou
 * @date 2020/1/7 11:34
 */
@Data
public class UserResponse implements Serializable {
    private String userId;
    private String username;
}
