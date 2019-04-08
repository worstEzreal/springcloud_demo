package com.worstezreal.sprngcloudfeign.service;

import com.worstezreal.service.HelloService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 通过继承服务方提供的api接口的方式实现feign调用
 *
 * @author zengxzh@yonyou.com
 * @date 2019/4/4
 */
@FeignClient("sc-consul")
public interface IHelloService2 extends HelloService {
}
