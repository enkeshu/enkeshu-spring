package com.enkeshu.spring.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author radish.zhou
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/1")
    public Object test1(){
        Map<String,Object> resultMap=new HashMap<>();
        resultMap.put("username","test1");
        resultMap.put("access_token", UUID.randomUUID().toString());
        return resultMap;
    }
    @RequestMapping("/2")
    public Object test2(){
        Map<String,Object> resultMap=new HashMap<>();
        resultMap.put("username","2");
        resultMap.put("access_token", UUID.randomUUID().toString());
        return resultMap;
    }
    @RequestMapping("/3")
    public Object test3(){
        Map<String,Object> resultMap=new HashMap<>();
        resultMap.put("username","3");
        resultMap.put("access_token", UUID.randomUUID().toString());
        return resultMap;
    }

}
