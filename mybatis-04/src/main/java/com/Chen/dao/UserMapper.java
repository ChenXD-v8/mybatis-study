package com.Chen.dao;

import com.Chen.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    User getUserById(int id);
    //分页实现查询
    List<User> getUserByLimit(Map<String,Object> map);

    //分页2
    List<User> getUserByRowBounds();
}
