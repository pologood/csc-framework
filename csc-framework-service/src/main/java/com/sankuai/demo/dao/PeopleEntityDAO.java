package com.sankuai.demo.dao;

import com.dianping.csc.common.service.dao.SqlMapDao;
import com.sankuai.demo.entity.PeopleEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

/**
* Created by csophys with template on 2016-1-29.
*/
public interface PeopleEntityDAO extends SqlMapDao {

    @Select("select * from PEOPLE where id = #{id}")
    PeopleEntity get(int id);

    @Delete("delete from PEOPLE where id = #{id}")
    int delete(int id);

    int insert(PeopleEntity e);

    int update(PeopleEntity e);
}
