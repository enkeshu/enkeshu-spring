package com.enkeshu.spring.feign.response;

import lombok.Data;

/**
 * @Author radish.zhou
 */
@Data
public class UserResponse extends BaseUserResponse {
    private int sex;
    private String email;
}
