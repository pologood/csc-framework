package com.dianping.csc.controller;

import com.dianping.csc.service.HelloService;
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

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model, @RequestParam("name") String name) {
        model.addAttribute("greeting", helloService.greeting(name));

        return "hello";
    }
}