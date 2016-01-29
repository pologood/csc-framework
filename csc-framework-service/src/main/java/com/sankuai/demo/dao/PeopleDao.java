package com.sankuai.demo.dao;

import com.dianping.csc.common.service.dao.SqlMapDao;
import com.sankuai.demo.entity.PeopleEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

/**
 * Created by csophys on 15/5/15.
 */
public interface PeopleDao extends SqlMapDao {
    @Select("select * from PEOPLE where id = #{id}")
    PeopleEntity get(int id);

    @Delete("delete from PEOPLE where id = #{id}")
    int delete(int id);


    int insert(PeopleEntity e);

    int update(PeopleEntity e);
}
