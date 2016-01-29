package com.sankuai.demo.entity;

import com.dianping.csc.common.service.entity.Entity;
import com.dianping.csc.common.service.util.DaoCodeGenerate;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by csophys on 15/5/15.
 */

@Data
public class PeopleEntity extends Entity implements Serializable {
    private String name;
    private String sex;
    private Integer memo;

    public static void main(String[] args) {
        DaoCodeGenerate.generateByJavaBean(PeopleEntity.class);
    }
}
