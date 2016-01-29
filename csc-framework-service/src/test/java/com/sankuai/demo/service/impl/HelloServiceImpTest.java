package com.sankuai.demo.service.impl;

import com.dianping.csc.common.service.util.SpringBaseWithCustomizeRunnerTest;
import com.sankuai.demo.service.HelloService;
import org.junit.Test;

import javax.annotation.Resource;

public class HelloServiceImpTest extends SpringBaseWithCustomizeRunnerTest {

    @Resource
    HelloService helloService;

    @Test
    public void testHello() throws Exception {
        helloService.hello("csophys");
    }
}