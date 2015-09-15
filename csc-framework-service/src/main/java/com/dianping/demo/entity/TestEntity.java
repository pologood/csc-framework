package com.dianping.demo.entity;

import com.dianping.csc.common.service.entity.Entity;
import com.dianping.csc.common.service.util.DaoCodeGenerate;
import lombok.Data;

import java.util.Date;

/**
 * Created by csophys on 15/9/4.
 */
@Data
public class TestEntity extends Entity {
    private String value;
    private Date date;

    public static void main(String[] args) {
        DaoCodeGenerate.generateByJavaBean(TestEntity.class);
    }

}

