package com.sankuai.demo.dao;

import com.dianping.csc.common.service.util.SpringBaseWithCustomizeRunnerTest;
import com.sankuai.demo.entity.PeopleEntity;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.transaction.AfterTransaction;
import org.springframework.test.context.transaction.BeforeTransaction;

import javax.annotation.Resource;

/**
 * Created by csophys on 15/5/15.
 */


public class AvatarPeopleService extends SpringBaseWithCustomizeRunnerTest {

    @Resource
    AvatarPeopleDao AvatarPeopleDao;

    /**
     * 默认开启事务自动回滚
     */
    @Test
    public void add() {
        Integer result = AvatarPeopleDao.insert(new PeopleEntity("csophys", "男", 42));
        Assert.assertTrue(result > 0);
        System.out.println("rollback " + result);
    }

    /**
     * 不需要事务自动回滚
     */
    @Test
    @Rollback(false)
    public void addWithouRollback() {
        Integer result = AvatarPeopleDao.insert(new PeopleEntity("csophys", "男", 42));
        Assert.assertTrue(result > 0);
        System.out.println("nonRollback:" + result);
    }

    @BeforeTransaction
    public void before() {
        System.out.println("before");
    }

    @AfterTransaction
    public void after() {
        System.out.println("after");
    }
}