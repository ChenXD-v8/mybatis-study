package com.Chen.dao;

import com.Chen.pojo.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface StudentMapper {
    @Select("select student.id,student.name,teacher.name from student join teacher on student.tid =teacher.id")
    List<Map<String,Object>> getStudentList();

    List<Student> getStudentList2();
    List<Student> getStudentList3();
}
