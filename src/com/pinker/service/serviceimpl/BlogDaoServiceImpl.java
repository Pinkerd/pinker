package com.pinker.service.serviceimpl;


import com.pinker.dao.BlogDao;
import com.pinker.dao.impl.BlogDaoImpl;
import com.pinker.entity.Blog;
import com.pinker.service.BlogDaoService;

import java.util.List;

public class BlogDaoServiceImpl implements BlogDaoService {
    BlogDao blogDao=new BlogDaoImpl();
    @Override
    public int SaveBlog(Blog blog) {
        return blogDao.SaveBlog(blog);
    }

    @Override
    public List<Blog> getAllBlog() {
        return blogDao.getAllBlog();
    }

    @Override
    public Blog getBlogById(Integer id) {
        return blogDao.getBlogById(id);
    }

    @Override
    public int DelBlog(Integer id) {
        return blogDao.DelBlog(id);
    }

    @Override
    public int UpdateBlog(Blog blog, Integer id) {
        return blogDao.UpdateBlog(blog,id);
    }
}
