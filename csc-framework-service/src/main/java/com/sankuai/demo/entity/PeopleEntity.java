package com.sankuai.demo.entity;

import com.dianping.csc.common.service.entity.Entity;
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

    public PeopleEntity(String name, String sex, Integer memo) {
        this.name = name;
        this.sex = sex;
        this.memo = memo;
    }

    public PeopleEntity() {
    }

    @Override
    public String toString() {
        return "PeopleEntity{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", memo=" + memo +
                '}';
    }
}
