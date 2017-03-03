package com.raycloud.service.imp;

import com.raycloud.dao.imp.UserDaoImp;
import com.raycloud.entity.User;
import com.raycloud.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 001117020015 on 2017/2/27.
 */
@Service()
public class UserServiceImp implements IUserService {
    @Autowired
    private UserDaoImp  userDaoImp;
    @Override
    public User queryById(int id) {
       User user =userDaoImp.queryById(id);
       return  user;
    }
}
