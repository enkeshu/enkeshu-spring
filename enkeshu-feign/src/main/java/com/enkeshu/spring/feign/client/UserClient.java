package com.enkeshu.spring.feign.client;

import com.enkeshu.spring.core.bean.AppResult;
import com.enkeshu.spring.feign.request.BaseUserRequest;
import com.enkeshu.spring.feign.response.BaseUserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import feign.RequestLine;
/**
 * @Author radish.zhou
 * @date 2020/1/7 11:14
 */
@FeignClient(name = "enkeshu-provider")
public interface UserClient {

    @RequestLine("GET /repos/{owner}/{repo}/contributors")
    <Req extends BaseUserRequest, Res extends BaseUserResponse> AppResult<Res> getUser(Req request);

}
