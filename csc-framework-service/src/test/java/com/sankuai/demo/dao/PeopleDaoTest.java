package com.sankuai.demo.dao;

import com.dianping.csc.common.service.util.SpringBaseWithCustomizeRunnerTest;
import com.sankuai.demo.entity.PeopleEntity;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

public class PeopleDaoTest extends SpringBaseWithCustomizeRunnerTest {
    public static final int TEST_ID = -1;
    @Resource
    PeopleDao peopleDao;

    @Test
    public void get() {
        PeopleEntity e = insertEntity(TEST_ID);
        Assert.assertTrue(peopleDao.get(e.getId()) != null);
    }

    @Test
    public void insert() {
        insertEntity(TEST_ID);
    }

    @Test
    public void delete() {
        Assert.assertTrue(peopleDao.delete(insertEntity(TEST_ID).getId()) > 0);
    }

    @Test
    public void update() {
        PeopleEntity e = new PeopleEntity();
        e.setName("csophys");
        e.setSex("男");
        e.setId(insertEntity(TEST_ID).getId());
        Assert.assertTrue(peopleDao.update(e) > 0);
    }

    private PeopleEntity insertEntity(int id) {
        PeopleEntity e = new PeopleEntity();
        e.setId(id);
        //TODO entity setting
        Assert.assertTrue(peopleDao.insert(e) == 1);
        return e;
    }


}