package com.dianping.demo.dao;

import base.SpringBaseWithCustomizeRunnerTest;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by csophys on 15/5/15.
 */
public class DemoDaoTest extends SpringBaseWithCustomizeRunnerTest {

    @Resource
    DemoDao demoDao;
    @Test
    public void testGetAll() throws Exception {
        System.out.println(demoDao.getAll());
    }
}