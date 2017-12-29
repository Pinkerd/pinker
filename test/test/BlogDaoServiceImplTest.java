package test;

import com.pinker.entity.Blog;
import com.pinker.entity.Page;
import com.pinker.entity.pk_user;
import com.pinker.service.BlogDaoService;
import com.pinker.service.Impl.BlogDaoServiceImpl;
import org.junit.Test;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class BlogDaoServiceImplTest {
    BlogDaoService blogDaoService=new BlogDaoServiceImpl();

    /**
     * 添加一条博文内容
     * @throws
     */
    @Test
    public void saveBlog() throws Exception {
        Blog blog = new Blog(null, "测试service", "测试service", "测试service", new Date(),1,1);
        blogDaoService.SaveBlog(blog);
    }

    /**
     * 获取库里所有博文内容
     * @throws
     */
    @Test
    public void getAllBlog() throws Exception {
        List<Blog> allBlog = blogDaoService.getAllBlog();
        System.out.print(allBlog);
    }

    /**
     * 通过pk_blog表中id为13的数据的topicId值查询userpk_user表的数据
     * @throws
     */
    @Test
    public void getBlogById() throws Exception {
        Blog blogById = blogDaoService.getBlogById(13);
        pk_user user = blogById.getUser();
        System.out.print(user);
    }

    /**
     * 删除一条博文内容
     * @throws
     */
    @Test
    public void delBlog() throws Exception {
        int i = blogDaoService.DelBlog(10);
    }

    /**
     * 修改（更新）一条数据
     * @throws Exception
     */
    @Test
    public void updateBlog() throws Exception {
        Blog blog=new Blog(null,"庄龙建","流批","6564656",new Date(),1,1);
        int i = blogDaoService.UpdateBlog(blog, 12);
    }

    /**
     * 分页查询测试
     * @throws Exception
     */
    @Test
    public void findBlog() throws Exception {

    }
}