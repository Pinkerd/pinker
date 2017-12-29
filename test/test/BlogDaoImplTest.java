package test;


import com.pinker.dao.BlogDao;
import com.pinker.dao.impl.BlogDaoImpl;
import com.pinker.entity.Blog;
import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.junit.Test;

import java.util.Date;
import java.util.List;


public class BlogDaoImplTest {
    BlogDao blogDao = new BlogDaoImpl();

    /**
     * 增加一条博文内容
     * @throws
     */
    @Test
    public void saveBlog() throws Exception {
        Blog blog = new Blog(null, "标题", "内容", "推按", new Date(),1,1);
        blogDao.SaveBlog(blog);
    }

    /**
     * 查询所有博文内容
     * @throws
     */
    @Test
    public void getAllBlog() throws Exception {
        List<Blog> allBlog = blogDao.getAllBlog();
        System.out.print(allBlog);
    }

    @Test
    public void getBlogById() throws Exception {
        Blog blogById = blogDao.getBlogById(10);
        System.out.print(blogById);
    }

    @Test
    public void delBlog() throws Exception {
        blogDao.DelBlog(7);
    }

    @Test
    public void updateBlog() throws Exception {
        Blog blog=new Blog(null,"庄龙建","流批","6564656",new Date(),1,1);
        int i = blogDao.UpdateBlog(blog, 11);
        System.out.print(i);
    }

    @Test
    public void findBlog() throws Exception {
    }

}