package com.raycloud.dao.imp;

import com.alibaba.cobar.client.CobarSqlMapClientDaoSupport;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.raycloud.dao.IUserDao;
import com.raycloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * Created by 001117020015 on 2017/2/27.
 */
public class UserDaoImp extends CobarSqlMapClientDaoSupport implements IUserDao{
    @Autowired
    private SqlMapClient  sqlMapClient;
    public void initSqlMapClient(){
        super.setSqlMapClient(sqlMapClient);
    }
    @Override
    public User queryById(int id) {
        User user =(User)super.getSqlMapClientTemplate().queryForObject("queryById",id);
        return user;
    }
}
