import com.Chen.dao.UserMapper;
import com.Chen.pojo.User;
import com.Chen.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {

    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        mapper.getUserById(1);
        sqlSession.close();
        System.out.println("+++++++++++++++++++++++++");
        mapper2.getUserById(1);
//        sqlSession.clearCache();
//        mapper.updateUserById(new User(1,"黄蛮儿","121212121"));
//        mapper.getUserById(2);
        sqlSession2.close();
    }
}
