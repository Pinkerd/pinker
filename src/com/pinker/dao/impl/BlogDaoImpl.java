package com.pinker.dao.impl;


import com.pinker.dao.BaseDao;
import com.pinker.dao.BlogDao;
import com.pinker.entity.Blog;

import java.util.List;

public class BlogDaoImpl extends BaseDao<Blog> implements BlogDao {
    /**
     * 增加一条数据
     */
    @Override
    public int SaveBlog(Blog blog) {
        String sql="insert into pk_blog(title,content,titleimg,publishtime,userId) values(?,?,?,?,?)";
        return this.update(sql,blog.getTitle(),blog.getContent(),blog.getTitleimg(),blog.getPublishtime(),blog.getUeserId());
    }
    /**
     *查询所有数据
     */
    @Override
    public List<Blog> getAllBlog() {
        String sql="select * from pk_blog";
        return this.getListBean(sql);
    }
    /**
     * 查询一条数据
     */
    @Override
    public Blog getBlogById(Integer id) {
        String sql="select * from pk_blog where id=?";
        return this.getBean(sql,id);
    }
    /**
     * 删除一条数据
     */
    @Override
    public int DelBlog(Integer id) {
        String sql="delete from pk_blog where id=?";
        return this.update(sql,id);
    }
    /**
     * 更新一条数据(修改)
     */
    @Override
    public int UpdateBlog(Blog blog,Integer id) {
        String sql="update pk_blog set title=?,content=?,titleimg=?,publishtime=?,userId=? where id=?";
        return this.update(sql,blog.getTitle(),blog.getContent(),blog.getTitleimg(),blog.getPublishtime(),blog.getUeserId(),id);
    }
}
