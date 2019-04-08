package com.worstezreal.sprngcloudzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class SprngcloudZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SprngcloudZuulApplication.class, args);
    }

    @RestController
    public static class HelloController {

        @RequestMapping("/hello")
        public String hello() {
            return "hello zuul!";
        }

    }

}
