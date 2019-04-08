package com.worstezreal.sprngcloudfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class SprngcloudFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SprngcloudFeignApplication.class, args);
    }

    @RestController
    public static class HelloController {
        @RequestMapping("/hello")
        public String hello() {
            return "hello feign";
        }
    }

}
