package com.sankuai.demo.service.impl;

import com.dianping.lion.client.Lion;
import com.dianping.pigeon.remoting.provider.config.annotation.Service;
import com.sankuai.demo.dao.PeopleDao;
import com.sankuai.demo.entity.PeopleEntity;
import com.sankuai.demo.service.HelloService;
import lombok.Data;

import javax.annotation.Resource;

@Service
@Data
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

    public static void main(String[] args) {
        System.out.println(Lion.get("csc-business-web.caseCircle.url"));
    }
}
