package com.enkeshu.spring.feign.request;

import lombok.Data;

/**
 * @Author radish.zhou
 */
@Data
public class BaseUserRequest {
    private String userId;
    private String username;
}
