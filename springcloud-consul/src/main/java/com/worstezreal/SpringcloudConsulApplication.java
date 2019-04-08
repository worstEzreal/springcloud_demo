package com.worstezreal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudConsulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsulApplication.class, args);
    }

    @RestController
    static class TestController {

        @RequestMapping("/hello")
        public String hello() {
            return "hello world";
        }

    }

}