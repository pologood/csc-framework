package com.sankuai.demo.dao;

import com.dianping.csc.common.service.util.SpringBaseWithCustomizeRunnerTest;
import com.sankuai.demo.entity.PeopleEntity;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

/**
* Created by csophys on with template on 2016-1-29.
*/
public class PeopleEntityDAOTest extends SpringBaseWithCustomizeRunnerTest {
    public static final int TEST_ID = -1;
    @Resource
    PeopleEntityDAO peopleEntityDAO;

    @Test
    public void get() {
        PeopleEntity e = insertEntity(TEST_ID);
        Assert.assertTrue(peopleEntityDAO.get(e.getId()) != null);
    }

    @Test
    public void insert() {
        insertEntity(TEST_ID);
    }

    @Test
    public void delete() {
        Assert.assertTrue(peopleEntityDAO.delete(insertEntity(TEST_ID).getId()) > 0);
    }

    @Test
    public void update() {
        PeopleEntity e = new PeopleEntity();
        //TODO set something
        e.setId(insertEntity(TEST_ID).getId());
        Assert.assertTrue(peopleEntityDAO.update(e) > 0);
    }

    private PeopleEntity insertEntity(int id) {
        PeopleEntity e = new PeopleEntity();
        e.setId(id);
        //TODO set something
        Assert.assertTrue(peopleEntityDAO.insert(e) == 1);
        return e;
    }
}