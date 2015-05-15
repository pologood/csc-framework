package com.dianping.demo.dao;

import com.dianping.avatar.dao.GenericDao;
import com.dianping.avatar.dao.annotation.DAOAction;
import com.dianping.avatar.dao.annotation.DAOActionType;
import com.dianping.demo.entity.Demo;

import java.util.List;

/**
 * Created by csophys on 15/5/15.
 */
public interface DemoDao extends GenericDao {

    @DAOAction(action = DAOActionType.QUERY)
    public List<Demo> getAll();
}
