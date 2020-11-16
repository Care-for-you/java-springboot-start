package com.ds.start.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloWorld
 * @Description 测试
 * @Author Ds.Yang
 * @Date 2020/10/20 11:58
 * @Version 1.0
 */
@RestController
public class HelloWorld {

    @Value(value = "${hello.world}")
    private String values;

    @RequestMapping(value = "hello/world")
    public String test() {
        System.err.println(values);
        return "hello world";
    }

}
