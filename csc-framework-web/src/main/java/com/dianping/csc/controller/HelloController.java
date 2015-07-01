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

    /**
     * 引用pigeon
     */
    @Reference
    private TelePhoneNumberService telePhoneNumberService;

    /**
     * 引用本地服务
     */
    @Resource
    private HelloService helloService;


    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model, @RequestParam("name") String name) {
        model.addAttribute("msg", telePhoneNumberService.normalize("15605198269"));
        model.addAttribute("greeting", helloService.greeting(name));

        return "hello";
    }
}