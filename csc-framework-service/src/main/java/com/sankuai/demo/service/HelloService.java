package com.sankuai.demo.service;

import com.sankuai.demo.entity.PeopleEntity;

/**
 * Created by yuchao on 15/7/9.
 */
public interface HelloService {
    String hello(String name);

    PeopleEntity getPeopleById(int id);
}
