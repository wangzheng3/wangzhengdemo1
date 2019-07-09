package com.wang.demo;

import com.wang.DemoApplication;
import com.wang.entity.User;
import com.wang.service.ServiceDemo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class DemoApplicationTests {

    @Autowired
    private ServiceDemo serviceDemo;
    @Test
    public void contextLoads() {
        List<User> ls = serviceDemo.findAllUser(new User());
        for(User user:ls){
            System.out.println(user+"::");
        }
    }
}

