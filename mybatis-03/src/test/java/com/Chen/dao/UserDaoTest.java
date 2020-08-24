package com.Chen.dao;

import com.Chen.pojo.User;
import com.Chen.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void getUserById(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user=userMapper.getUserById(2);
        System.out.println(user);
        sqlSession.close();
    }


}
