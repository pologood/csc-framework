package com.dianping.demo.dao;

import com.dianping.csc.common.service.dao.DAOTest;
import com.dianping.demo.entity.PeopleEntity;

import javax.annotation.Resource;

/**
 * Created by csophys on 15/5/15.
 */
public class PeopleDaoTest extends DAOTest {

    @Resource
    PeopleDao peopleDao;
    PeopleEntity peopleEntity;

    @Override
    protected void init() {
        peopleEntity = new PeopleEntity("yuchao", "男", 42);
        set(peopleDao, peopleEntity);
    }

    @Override
    protected void doUpdate() {
        peopleEntity.setName("张三");
    }
}