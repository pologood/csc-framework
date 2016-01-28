package com.sankuai.demo.service.impl;

import com.sankuai.demo.dao.PeopleDao;
import com.sankuai.demo.entity.PeopleEntity;
import com.sankuai.demo.service.HelloService;
import com.dianping.pigeon.remoting.provider.config.annotation.Service;

import javax.annotation.Resource;

@Service
public class HelloServiceImp implements HelloService {

    @Resource
    PeopleDao peopleDao;

    public String hello(String name) {
        return "您好，" + name;
    }

    @Override
    public PeopleEntity getPeopleById(int id) {
        return peopleDao.get(id);
    }
}
