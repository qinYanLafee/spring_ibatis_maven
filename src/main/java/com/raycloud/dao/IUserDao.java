package com.raycloud.dao;

import com.raycloud.entity.User;

/**
 * Created by 001117020015 on 2017/2/27.
 */
public interface IUserDao {
    public User queryById(int id);
}
