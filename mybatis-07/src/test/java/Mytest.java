import com.Chen.dao.TeacherMapper;
import com.Chen.pojo.Teacher;
import com.Chen.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class Mytest {
    @Test
    public void getTeacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        for (Teacher teacher : sqlSession.getMapper(TeacherMapper.class).getTeachers()) {
            System.out.println(teacher);
        }
        sqlSession.close();
    }
    @Test
    public void getTeacher1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        System.out.println(sqlSession.getMapper(TeacherMapper.class).getTeacher2(1));
        sqlSession.close();
    }
}
