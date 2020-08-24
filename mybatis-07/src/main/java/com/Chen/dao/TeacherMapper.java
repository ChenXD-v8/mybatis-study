package com.Chen.dao;

import com.Chen.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {

    List<Teacher> getTeachers();

    //获取指定ID的老师下的学生和老师信息
    Teacher getTeacher(@Param("id") int id);
    Teacher getTeacher2(@Param("id") int id);

}
