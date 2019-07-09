package com.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author   wangzheng
 * @date 2019  0105
 *
 * */
@SpringBootApplication
@EnableCaching
public class DemoApplication {

    public static void main(String[] args)
    {
      SpringApplication.run(DemoApplication.class);
    }
}

