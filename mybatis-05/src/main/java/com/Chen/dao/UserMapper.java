package com.Chen.dao;

import com.Chen.pojo.User;
import org.apache.ibatis.annotations.*;
import sun.nio.cs.US_ASCII;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    @Select("select * from user")
    List<User> getUsers();
    @Select("select * from user where id =#{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into user(id,name,pwd) values(#{id},#{name},#{password})")
    int addUser(User user);
    @Update("update user set name= #{name},pwd=#{password} where id=#{id}")
    int updateUses(User user);

    @Delete("delete from user where id =#{id}")
    int deleteUser(@Param("id") int id);
}
