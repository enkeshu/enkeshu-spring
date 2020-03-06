package com.enkeshu.spring.nacos.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nacos/consumer")
public class ConsumerController {

    @Autowired
    NacosFeignApi nacosFeignApi;

    @RequestMapping("/api1")
    public Object api1(String name) {
        return nacosFeignApi.api1(name);
    }

}
