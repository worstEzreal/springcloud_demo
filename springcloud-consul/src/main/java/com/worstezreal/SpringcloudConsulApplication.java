package com.worstezreal;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.worstezreal.entity.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@EnableApolloConfig
public class SpringcloudConsulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsulApplication.class, args);
    }

    @RestController
    static class TestController {

        @ApolloConfig
        private Config config;

        @Value("${rest.connect.timeout}")
        private String timeout;

        @RequestMapping("/hello")
        public Result hello() {
            return new Result(0, "hello world");
        }

        @RequestMapping("/config")
        public Result config() {
            return new Result(0, "timeout is : " + timeout);
//            return new Result(0, "timeout is : " + config.getIntProperty("rest.connect.timeout", 0));
        }

    }

}
