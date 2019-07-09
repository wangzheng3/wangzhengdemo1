package com.wang.dao;

import com.wang.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import javax.persistence.Cacheable;
import java.util.List;

/**
 * @Author: wang
 * @Descroption:
 * @Date:
 */
@Mapper
public interface IUserDao {
    /**
     *
     * 这是一个查询的方法
     * @param name
     * @return
     */
   @Select("select *from users")
     List<User> findUserByName(User user);

    /**
     * 这是一个查询的方法
     * @param user
     * @return
     */
    @Select("select * from users  where id= #{id}")
     User findUserByUser(Long id);

    /**
     * 这个一个插入用户的方法，返回一个Boolean类型的值
     * @param user
     * @return  这个一个插入用户的方法，返回一个Boolean类型的值
     */
   @Insert("insert into users(username,password) values(#{username},#{password})")
     boolean  insertUser(User user);


}
