package com.pinker.service.Impl;

import com.pinker.dao.CommentDao;
import com.pinker.dao.impl.CommentDaoImpl;
import com.pinker.entity.Comment;
import com.pinker.service.CommentService;

import java.util.List;

public class CommentServiceImpl implements CommentService {
    private CommentDao comm=new CommentDaoImpl();
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
        Comment getselect = comm.getselect(blogId);
        return getselect;
    }

    /**
     * 查询多个的方法
     * @return
     */
    @Override
    public List<Comment> getselectAll() {
        List<Comment> comments = comm.getselectAll();
        return comments;
    }
}
