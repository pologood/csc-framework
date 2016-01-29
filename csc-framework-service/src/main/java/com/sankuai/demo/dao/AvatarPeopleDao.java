package com.sankuai.demo.dao;

import com.dianping.csc.common.service.dao.DAO;
import com.sankuai.demo.entity.PeopleEntity;

/**
 * Created by csophys on 15/5/15.
 */
@Deprecated
/**
 * 使用avatar 到的方式，不建议使用，建议使用Mybatis的方式，参考PeopleDao的实现
 */
public interface AvatarPeopleDao extends DAO<PeopleEntity> {
}
