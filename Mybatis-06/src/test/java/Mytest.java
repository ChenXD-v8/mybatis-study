import com.Chen.dao.StudentMapper;
import com.Chen.dao.TeacherMapper;
import com.Chen.pojo.Student;
import com.Chen.pojo.Teacher;
import com.Chen.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Mytest {
    @Test
    public void getTeacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }

    @Test
    public void getAllStudentAndTeacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Map<String,Object>> studentList=new ArrayList<>();
        studentList=mapper.getStudentList();
        for (Map<String, Object> map : studentList) {
            System.out.println(map);
        }
        sqlSession.close();
    }
    @Test
    public void getStudentList(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students=mapper.getStudentList2();
        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.close();
    }
    @Test
    public void getStudent3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students=mapper.getStudentList3();
        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
