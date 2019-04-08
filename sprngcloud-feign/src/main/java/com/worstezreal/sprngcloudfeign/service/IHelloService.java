package com.worstezreal.sprngcloudfeign.service;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 通过consul的服务注册发现调用sc-consul服务的/hello接口
 *
 * @author zengxzh@yonyou.com
 * @date 2019/4/4
 */
//@FeignClient("sc-consul")
public interface IHelloService {

    @RequestMapping("/hello")
    String hello();

}
