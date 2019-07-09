package com.wang.controller;
import  com.wang.entity.User;
import com.wang.service.ServiceDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wangzheng
 *
 */
@RestController
@RequestMapping("/")
public class ControllerDemo {
    @Autowired

    private ServiceDemo serviceDemo;
    /**
     *  这是一个查询的方法
     * @description
     * @param   wz
     * @return
     *
     */
    @RequestMapping("findalluser")
   private  List<User> findAllUser(User user){
        return   serviceDemo.findAllUser(user);
    }

    @RequestMapping("insertuser")
    public void  insertUser( User user){
        user.setUsername("wqqqq");
        user.setPassword("123456789");
        boolean b = serviceDemo.insertUser(user);
        System.out.println("插入的结果为："+b);
    }
    @RequestMapping("finduser/{id}")
    private  User  findUser(@PathVariable("id") Long id){
      User  u = serviceDemo.findUser(id);
      return u;
    }
}
