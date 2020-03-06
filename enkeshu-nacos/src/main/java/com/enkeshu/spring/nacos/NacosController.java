package com.enkeshu.spring.nacos;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/nacos")
public class NacosController {
    @PostMapping("/api1")
    Object api1(String name) {
        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("name", name);
        resultMap.put("access_token", UUID.randomUUID().toString());
        return resultMap;
    }
}
