package com.enkeshu.spring.nacos.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@FeignClient(name = "enkeshu-nacos", path = "/nacos")
public interface NacosFeignApi {
    @PostMapping("/api1")
    Object api1(String name);
}
