package com.enkeshu.spring.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author radish.zhou
 */
@SpringBootApplication
@EnableEurekaServer
public class EnkeshuEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnkeshuEurekaApplication.class, args);
    }

}
