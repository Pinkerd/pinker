package com.pinker.service.Impl;


import com.pinker.dao.BlogDao;
import com.pinker.dao.TopicDao;
import com.pinker.dao.UserDao;
import com.pinker.dao.impl.BlogDaoImpl;
import com.pinker.dao.impl.TopicDaoImpl;
import com.pinker.dao.impl.UserDaoImpl;
import com.pinker.entity.Blog;
import com.pinker.entity.Page;
import com.pinker.service.BlogDaoService;

import java.util.List;

public class BlogDaoServiceImpl implements BlogDaoService {
    BlogDao blogDao=new BlogDaoImpl();
    TopicDao topicDao=new TopicDaoImpl();
    UserDao userDao=new UserDaoImpl();

    /**
     * 保存博客
     * @param blog
     * @return
     */
    @Override
    public int SaveBlog(Blog blog) {
        return blogDao.SaveBlog(blog);
    }

    /**
     * 获取所有博客
     * @return
     */
    @Override
    public List<Blog> getAllBlog() {
        return blogDao.getAllBlog();
    }

    /**
     * 通过ID获取一个博客
     * @param id
     * @return
     */
    @Override
    public Blog getBlogById(Integer id) {
        Blog blog=blogDao.getBlogById(id);
        this.setFull(blog);
        return blog;
    }

    /**
     * 数据填充方法
     * @param blog
     */
    private void setFull(Blog blog){
        int topicId=blog.getTopicId();
        int userId=blog.getUserId();
        blog.setTopic(topicDao.selectOne(topicId));//填充话题属性
        blog.setUser(userDao.findByUserId(userId));//填充用户属性
    }

    /**
     * 删除博客（测试用，正式项目禁用）
     * @param id
     * @return
     */
    @Override
    public int DelBlog(Integer id) {
        return blogDao.DelBlog(id);
    }

    /**
     * 更新博客
     * @param blog
     * @param id
     * @return
     */
    @Override
    public int UpdateBlog(Blog blog, Integer id) {
        return blogDao.UpdateBlog(blog,id);
    }


    /**
     * 分页查询
     * @param page
     * @return
     */
    @Override
    public Page<Blog> findBlog(Page<Blog> page) {
        Page<Blog> blogPage=blogDao.findBlog(page);

        for(Blog blog:blogPage.getData()){
            this.setFull(blog);
        }
        return  blogPage;
    }
}
