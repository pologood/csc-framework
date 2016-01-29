package com.sankuai.demo.service.impl;

import com.dianping.pigeon.remoting.provider.config.annotation.Service;
import com.sankuai.demo.service.HelloService;

@Service
public class HelloServiceImp implements HelloService {


    public static final String PREFIX = "您好，";

    public String hello(String name) {
        return PREFIX + name;
    }

}
