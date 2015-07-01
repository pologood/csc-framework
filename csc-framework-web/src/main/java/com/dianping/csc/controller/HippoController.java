package com.dianping.csc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yuchao on 15/7/1.
 */
@Controller
public class HippoController {

    @RequestMapping("/hippo")
    public String hippo() {
        return "hippo";
    }
}
