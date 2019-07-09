package com.wang.service;
import  com.wang.entity.User;

import java.util.List;

/**
 * @Author: wangzheng
 * @Descroption:
 * @Date:
 */
public interface ServiceDemo {

    /**
     *  这是一个查询的方fa
     * @param  name
     * @return
     *
     */
    List<User> findAllUser(User user);
    /**
     *
     * 这是一个插入的方法
     * @param user
     * @return
     *
     */
    boolean  insertUser(User user);

    /**
     *
     *  这是一个查询的方法
     * @param   user
     * @return
     *
     */
    User findUser(Long  id);
}
