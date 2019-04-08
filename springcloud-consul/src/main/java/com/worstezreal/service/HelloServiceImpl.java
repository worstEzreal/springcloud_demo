package com.worstezreal.service;

import org.springframework.web.bind.annotation.RestController;

/**
 * Desc
 *
 * @author zengxzh@yonyou.com
 * @version V1.0.0
 * @date 2019/4/4
 */
@RestController
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello() {
        return "hello feign service provider";
    }
}