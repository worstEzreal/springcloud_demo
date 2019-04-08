package com.worstezreal.service;

import com.worstezreal.entity.Result;
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
    Result hello();

}
