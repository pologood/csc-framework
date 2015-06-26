package com.dianping.demo.entity;

import com.dianping.csc.common.service.entity.Entity;
import lombok.Data;

/**
 * Created by csophys on 15/5/15.
 */

@Data
public class PeopleEntity extends Entity {
    private String name;
    private String sex;
    private Integer memo;

    public PeopleEntity(String name, String sex, Integer memo) {
        this.name = name;
        this.sex = sex;
        this.memo = memo;
    }

    public PeopleEntity() {
    }
}
