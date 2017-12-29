package com.pinker.dao;

import com.pinker.entity.Comment;
import com.pinker.entity.Page;

import java.util.List;

/**
 * comment接口
 */

public interface CommentDao {

    /**
     * 增加评论
     */
  int savecom(Comment comment);
    /**
     * 删除评论
     */
  int getdelct(Comment comment);
    /**
     * 查询单条评论
     */
  Comment getselect(int blogId);
    /**
     * 查询多个评论
     */
    List<Comment> getselectAll();

  /**
   * 分页查询
   */
  Page<Comment> findComment(Page<Comment> page);
}
