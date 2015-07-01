package com.dianping.csc.controller;

import org.junit.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Created by yuchao on 15/6/30.
 */

public class HelloControllerTest extends BaseTest {

    @Test
    public void testPrintWelcome() throws Exception {
        mockMvc.perform(get("/hello?name=俞超"))
                .andExpect(status().isOk())
                .andExpect(view().name("hello"));
    }
}