package com.sankuai.demo.service.impl;

import com.dianping.pigeon.remoting.provider.config.annotation.Service;
import com.sankuai.demo.dao.PeopleDao;
import com.sankuai.demo.service.HelloService;

import javax.annotation.Resource;

@Service
public class HelloServiceImp implements HelloService {


    public static final String PREFIX = "您好，";
    @Resource
    PeopleDao peopleDao;

    public String hello(String name) {
        return PREFIX + name;
    }

}
