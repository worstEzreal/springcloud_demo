package com.worstezreal.service;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Desc
 *
 * @author zengxzh@yonyou.com
 * @version V1.0.0
 * @date 2019/4/4
 */
@RequestMapping("/api")
public interface HelloService {

    @RequestMapping("/hello")
    String hello();

}
