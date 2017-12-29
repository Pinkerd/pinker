package com.pinker.service.Impl;

import com.pinker.dao.BlogDao;
import com.pinker.dao.CommentDao;
import com.pinker.dao.UserDao;
import com.pinker.dao.impl.BlogDaoImpl;
import com.pinker.dao.impl.CommentDaoImpl;
import com.pinker.dao.impl.UserDaoImpl;
import com.pinker.entity.Blog;
import com.pinker.entity.Comment;
import com.pinker.entity.Page;
import com.pinker.entity.pk_user;
import com.pinker.service.CommentService;

import java.util.List;

public class CommentServiceImpl implements CommentService {
    private CommentDao comm=new CommentDaoImpl();
    private BlogDao blogDao=new BlogDaoImpl();
    private UserDao userDao=new UserDaoImpl();
    /**
     * 增加的方法
     * @param comment
     * @return
     */
    @Override
    public boolean savecom(Comment comment) {
        int savecom = comm.savecom(comment);
        return savecom!=0;
    }

    /**
     * 删除的方法
     * @param comment
     * @return
     */
    @Override
    public boolean getdelct(Comment comment) {
        int getdelct = comm.getdelct(comment);
        return getdelct!=0;
    }

    /**
     * 查询一个的方法
     * @param blogId
     * @return
     */
    @Override
    public Comment getselect(int blogId) {
        Comment comment = comm.getselect(blogId);
        this.setFull(comment);
        return comment;
    }

    /**
     * 查询多个的方法
     * @return
     */
    @Override
    public List<Comment> getselectAll() {
        List<Comment> comments = comm.getselectAll();
        for (Comment com: comments) {
            this.setFull(com);
        }
        return comments;
    }

    /**
     * 填充博客，用户对象
     * @param comment
     */
    private void setFull(Comment comment){
        Blog blog=blogDao.getBlogById(comment.getBlogId());
        pk_user user=userDao.findByUserId(comment.getUserId());

        comment.setBlog(blog);
        comment.setUser(user);
    }


    /**
     * 分页显示评论页
     * @param page
     * @return
     */
    @Override
    public Page<Comment> findComment(Page<Comment> page) {
        Page<Comment> commentPage=comm.findComment(page);
        for(Comment comment:commentPage.getData()){
            this.setFull(comment);

        }
        return commentPage;
    }


}
