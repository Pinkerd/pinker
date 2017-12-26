package com.pinker.dao.impl;

import com.pinker.dao.BaseDao;
import com.pinker.dao.CommentDao;
import com.pinker.entity.Comment;

import java.util.List;

public class CommentDaoImpl extends BaseDao<Comment> implements CommentDao {
    /**
     * 增加评论的方法
     * @param
     * @return
     */
    @Override
    public int savecom(Comment comment) {
        String sql="insert into pk_comment(blogId,userId,content,publishtime) value(?,?,?,?)";
        return this.update(sql,comment.getBlogId(),comment.getUserId(),comment.getContent(),comment.getPublishtime());
    }
    /**
     * 删除评论的方法
     * @param
     * @return
     */
    @Override
    public int getdelct(Comment comment) {
        String sql="delete from pk_comment where blogId=?";
        return this.update(sql,comment.getBlogId());
    }
    /**
     * 查询单条评论的方法
     * @param
     * @return
     */
    @Override
    public Comment getselect(int blogId) {
        String sql="select blogId,userId,content,publishtime from pk_comment where blogId=?";
        return this.getBean(sql,blogId);
    }
    /**
     * 查询多条评论的方法
     * @param
     * @return
     */
    @Override
    public List<Comment> getselectAll() {
        String sql="select * from pk_comment";
        return this.getListBean(sql);
    }
}
