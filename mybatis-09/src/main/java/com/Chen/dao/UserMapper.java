package com.Chen.dao;

import com.Chen.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User getUserById(@Param("id") int id);
    int updateUserById(User user);
}
