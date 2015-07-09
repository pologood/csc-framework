package com.dianping.demo.service.impl;

import com.dianping.demo.service.HelloService;
import com.dianping.pigeon.remoting.provider.config.annotation.Service;

/**
 * 用 com.dianping.pigeon.remoting.provider.config.annotation.Service 进行注册
 * 该注解同时将该service变成一个bean，所以本项目中其他地方可以通过@Resource引用
 *
 * ＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
 *
 * ||       千万要注意，service的实现不能以Impl结尾 ，否则pigeon注册不成功           ||
 *
 * ＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
 * Created by yuchao on 15/7/9.
 */
@Service
public class HelloServiceImp implements HelloService {

    public String hello(String name) {
        return "您好，" + name;
    }
}
