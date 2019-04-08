package com.worstezreal.sprngcloudfeign.controller;

import com.worstezreal.sprngcloudfeign.service.IHelloService;
import com.worstezreal.sprngcloudfeign.service.IHelloService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc
 *
 * @author zengxzh@yonyou.com
 * @version V1.0.0
 * @date 2019/4/4
 */
@RestController
public class FeignController {

//    @Autowired
//    private IHelloService helloService;
//    @RequestMapping("/feign/hello")
//    public String feignHello() {
//        return helloService.hello();
//    }

    @Autowired
    private IHelloService2 helloService2;


    @RequestMapping("/hello2")
    public String feignHello2() {
        return helloService2.hello();
    }

}
