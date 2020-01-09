package com.enkeshu.spring.webmvc.controller;

import com.enkeshu.spring.core.bean.AppResult;
import com.enkeshu.spring.feign.client.UserClient;
import com.enkeshu.spring.feign.request.BaseUserRequest;
import com.enkeshu.spring.feign.response.BaseUserResponse;

/**
 * @Author radish.zhou
 * @date 2020/1/7 11:36
 */
public class UserController implements UserClient {
    @Override
    public <Req extends BaseUserRequest, Res extends BaseUserResponse> AppResult<Res> getUser(Req request) {
        return null;
    }
}
