package com.dianping.csc.service.impl;

import com.dianping.cat.Cat;
import com.dianping.csc.service.HelloService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * Created by yuchao on 15/6/30.
 */
@Service
public class HelloServiceImpl implements HelloService {
    private static final Logger LOG = Logger.getLogger(HelloService.class);

    public String greeting(String name) {
        LOG.info("name = " + name);
        LOG.error("name = " + name);
        Cat.getProducer().logEvent("greeting", name);

        return "hello, " + name;
    }
}
