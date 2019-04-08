package com.worstezreal.service;

import com.worstezreal.entity.Result;
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
    public Result hello() {
        return new Result(0, "hello feign service provider");
    }
}