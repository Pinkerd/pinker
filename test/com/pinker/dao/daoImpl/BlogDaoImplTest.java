package com.pinker.dao.daoImpl;



import com.pinker.dao.BlogDao;
import com.pinker.dao.impl.BlogDaoImpl;
import com.pinker.entity.Blog;
import org.junit.Test;

import java.sql.Date;
import java.util.List;


public class BlogDaoImplTest {
    BlogDao blogDao=new BlogDaoImpl();
    @Test
    public void saveBlog() throws Exception {
        Blog blog=new Blog(null,"庄龙建","888","niubi ",new java.util.Date(),12);
        blogDao.SaveBlog(blog);
    }

    @Test
    public void getAllBlog() throws Exception {
        List<Blog> blog = blogDao.getAllBlog();
        System.out.println(blog);
    }

    @Test
    public void getBlogById() throws Exception {
        Blog blogById = blogDao.getBlogById(3);
        System.out.println(blogById);
    }

    @Test
    public void delBlog() throws Exception {
        int i = blogDao.DelBlog(2);
        System.out.println(i);
    }

    @Test
    public void updateBlog() throws Exception {
        Blog blog=new Blog(null,"剑","男","地对地导弹",new Date(1996,1,1),3);
        int i = blogDao.UpdateBlog(blog, 3);
        System.out.println(i);
    }
}
