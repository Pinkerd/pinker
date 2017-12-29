package com.pinker.dao.impl;

import com.pinker.dao.BaseDao;
import com.pinker.dao.CommentDao;
import com.pinker.entity.Comment;
import com.pinker.entity.Page;

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

    @Override
    public Page<Comment> findComment(Page<Comment> page) {
        String totalRecodeSql="select count(*) from pk_comment";
        //书总数
        long totalRecodeL= 0;

        totalRecodeL = (long) this.getSingleValue(totalRecodeSql);

        int totalRecode= (int) totalRecodeL;
        page.setTotalRecord(totalRecode);
        //页面显示行数
        int pageSize=page.getPageSize();
        //偏移索引值
        int index=page.getIndex();

        String listSql="select * from pk_comment limit ?,?";
        List<Comment> list=this.getListBean(listSql,index,pageSize);

        page.setData(list);
        return page;


    }
}
