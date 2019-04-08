package com.worstezreal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Desc
 *
 * @author zengxzh@yonyou.com
 * @version V1.0.0
 * @date 2019/4/8
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {

    private int code;

    private String msg;

    private T data;

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
