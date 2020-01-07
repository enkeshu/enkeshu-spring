package com.enkeshu.spring.feign.client;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author radish.zhou
 * @date 2020/1/7 11:14
 */
@FeignClient(name = "enkeshu-webmvc-provider")
public interface UserClient {


}
