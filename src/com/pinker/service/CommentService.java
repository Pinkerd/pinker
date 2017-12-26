package com.pinker.service;

import com.pinker.entity.Comment;

import java.util.List;

/***
 * CommentService接口
 */

public interface CommentService {
    /**
     * 增加评论
     */
    boolean savecom(Comment comment);
    /**
     * 删除评论
     */
    boolean getdelct(Comment comment);
    /**
     * 查询单条评论
     */
    Comment getselect(int blogId);
    /**
     * 查询多个评论
     */
    List<Comment> getselectAll();
}
