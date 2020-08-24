import com.Chen.dao.BlogMapper;
import com.Chen.pojo.Blog;
import com.Chen.utils.IDUtils;
import com.Chen.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.SQLPermission;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Mytest2 {
   @Test
   public void insertBlog(){
       SqlSession sqlSession=MybatisUtils.getSqlSession();
       BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
       Blog blog=new Blog();
       blog.setId(IDUtils.getRandomId());
       blog.setTitle("两袖青蛇");
       blog.setAuthor("李淳罡");
       blog.setCreateTime(new Date());
       blog.setViews(11111);
       mapper.insertBlog(blog);
       blog.setId(IDUtils.getRandomId());
       blog.setTitle("一剑开天门");
       blog.setAuthor("李淳罡");
       blog.setCreateTime(new Date());
       blog.setViews(222);
       mapper.insertBlog(blog);
       blog.setId(IDUtils.getRandomId());
       blog.setTitle("剑来");
       blog.setAuthor("李淳罡");
       blog.setCreateTime(new Date());
       blog.setViews(3333);
       mapper.insertBlog(blog);
       blog.setId(IDUtils.getRandomId());
       blog.setTitle("扶墙而出");
       blog.setAuthor("徐凤年");
       blog.setCreateTime(new Date());
       blog.setViews(999);
       mapper.insertBlog(blog);
       blog.setId(IDUtils.getRandomId());
       blog.setTitle("我有一剑学自中原剑客温华，这一剑 请你出城！");
       blog.setAuthor("徐凤年");
       blog.setCreateTime(new Date());
       blog.setViews(999);
       mapper.insertBlog(blog);

       blog.setId(IDUtils.getRandomId());
       blog.setTitle("莫说我穷的叮当响，大袖揽清风");
       blog.setAuthor("徐凤年");
       blog.setCreateTime(new Date());
       blog.setViews(555);
       mapper.insertBlog(blog);
       blog.setId(IDUtils.getRandomId());
       blog.setTitle("今日解签，宜下江南");
       blog.setAuthor("洪冼象");
       blog.setCreateTime(new Date());
       blog.setViews(1200);
       mapper.insertBlog(blog);
       sqlSession.commit();
       sqlSession.close();
   }

   @Test
   public void queryBlogIF(){
      SqlSession sqlSession = MybatisUtils.getSqlSession();
      BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
      HashMap map = new HashMap();

      map.put("title","扶墙而出");
      map.put("author","徐凤年");
      List<Blog> blogs = mapper.quereBlogIF(map);
      for (Blog blog : blogs) {
         System.out.println(blog);
      }
      sqlSession.close();
   }

   @Test
   public void queryBlogChooose(){
      SqlSession sqlSession = MybatisUtils.getSqlSession();
      BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
      HashMap map = new HashMap();

      //map.put("title","扶墙而出");
     //map.put("author","徐凤年");
      map.put("views",999);
      List<Blog> blogs = mapper.quereBlogChoose(map);
      for (Blog blog : blogs) {
         System.out.println(blog);
      }
      sqlSession.close();
   }

   @Test
   public void updateBlogSet(){
      SqlSession sqlSession = MybatisUtils.getSqlSession();
      BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
      HashMap map = new HashMap();

//      map.put("title","莫说我穷的叮当响，大袖揽清风；莫讥我困时无处眠，天地做床被;莫笑我渴时无美酒，江湖来做壶");
//      map.put("author","徐凤年");
      map.put("id","b23970fd26f44a9c8ff7a45a71ad1ded");
      mapper.updateBlogById(map);
      sqlSession.commit();
      sqlSession.close();
   }

   @Test
   public void queryBlogForeach(){
      SqlSession sqlSession = MybatisUtils.getSqlSession();
      BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
      HashMap map = new HashMap();
      List<Integer> ids=new ArrayList<Integer>();
      ids.add(1);
      ids.add(2);
      ids.add(4);
      map.put("ids",ids);
      List<Blog> blogs = mapper.queryBlogForeach(map);
      for (Blog blog : blogs) {
         System.out.println(blog);
      }
      sqlSession.close();
   }
}
