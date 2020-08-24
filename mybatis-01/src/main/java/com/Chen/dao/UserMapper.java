package com.Chen.dao;

import com.Chen.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserLike(String value);
    List<User> getUserList();
    User getUserById(int id);
    User getUserById2(Map<String,Object> map);
    //insert一个用户
    int addUser(User user);
    //万能的map
    int addUser2(Map<String,Object> map);
    //修改用户
    int updateUser(User user);

    int deleteUser(int id);


}
