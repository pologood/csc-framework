package com.dianping.csc.controller;

import com.dianping.csc.service.HelloService;
import com.dianping.csc.telephone.service.TelePhoneNumberService;
import com.dianping.pigeon.remoting.invoker.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @Resource
    private HelloService helloService;

    @Reference
    private TelePhoneNumberService telePhoneNumberService;

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model, @RequestParam("name") String name) {
        String originTelephoneNum = "15605198269";
        String normalize = telePhoneNumberService.normalize(originTelephoneNum);

        model.addAttribute("greeting", helloService.greeting(name));
        model.addAttribute("pigeonTest", "调用pigeon服务测试：" + originTelephoneNum + "规格化之后为" + normalize);

        return "hello";
    }
}