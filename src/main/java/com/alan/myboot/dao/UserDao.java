package com.alan.myboot.dao;

import com.alan.myboot.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author : hechucai
 * @Description :
 * @Date : Created in ${time} ${date}
 * @Modified By :
 */

@Mapper
public interface UserDao {

    /**根据姓名查找
    * @param  name String 用户姓名
    * */
    @Select("select * from tuser where name=#{name}")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "name",column = "name"),
            @Result(property = "age",column = "age"),
            @Result(property = "address",column = "address")
    })
    User findUserByName(@Param("name") String name);

    /**
     *
     */
    @Select("select * from tuser")
    List<User> findAllUser();
}
