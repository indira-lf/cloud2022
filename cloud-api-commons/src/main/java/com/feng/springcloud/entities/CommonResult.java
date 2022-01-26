package com.feng.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;


/**
 * @author
 * @time 2022/1/21 20:01
 * @Description- TODO
 */
@Data
@AllArgsConstructor
//@NoArgsConstructor
public class CommonResult<T>{
    private Integer code;
    private String message;
    private T data;

    public CommonResult() {
    }

    public CommonResult(Integer code, String message){
        this(code,message,null);
    }
}
