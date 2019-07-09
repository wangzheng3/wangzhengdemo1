package com.wang.service;

import com.wang.dao.IUserDao;
import com.wang.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wangzheng
 * @Descroption:
 * @Date:
 */
@Service
public class ServiceDemoImpl implements  ServiceDemo {

 @Autowired
 private IUserDao userDao;


    @Override
    @Cacheable(value="users",key = "22",unless = "#result==null")
    public List<User> findAllUser(User user) {
        return userDao.findUserByName(user);
    }

    @Override
    public boolean insertUser(User user) {
        return  userDao.insertUser(user);
    }

    @Override
//    @Cacheable(value="user",unless = "#result==null",condition = "#id%5==0")
    @Cacheable(value = "u")
    public User findUser(Long id) {
        System.out.println("在数据库查询用户信息。。。。。。。。。");
        return userDao.findUserByUser(id);
    }

}
