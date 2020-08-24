package com.Chen.dao;

import com.Chen.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    int insertBlog(Blog blog);

    List<Blog> quereBlogIF(Map map);
    List<Blog> quereBlogChoose(Map map);
    int updateBlogById(Map map);

    //foreach查询
    List<Blog> queryBlogForeach(Map map);

}
