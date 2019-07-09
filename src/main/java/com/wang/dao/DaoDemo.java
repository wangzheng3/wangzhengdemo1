package com.wang.dao;

import com.wang.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * @Author: wangzheng
 * @Descroption:
 * @Date:
 */
@Repository
public interface DaoDemo extends JpaRepository<User,Long> {


}
