package com.pinker.dao.impl;


import com.pinker.dao.BaseDao;
import com.pinker.dao.TopicDao;
import com.pinker.entity.Page;
import com.pinker.entity.pk_topic;

import java.util.List;

public class TopicDaoImpl extends BaseDao<pk_topic> implements TopicDao {
    @Override
    public pk_topic selectOne(Integer id) {
      String sql = "select id,title,content,titleimg,userId,publishtime from pk_topic where id =?";
        return getBean(sql,id);
    }

    @Override
    public List<pk_topic> selectAll() {
        String sql = "select * from pk_topic";
        return getListBean(sql);
    }

    @Override
    public int add(String title, String content, String titleimg, Integer userId) {
        String sql = "insert into pk_topic(title,content,titleimg,userId,publishtime) values(?,?,?,?,NOW())";
        return update(sql,title,content,titleimg,userId);
}

    @Override
    public int change(String title,String content,String titleimg,Integer userId) {
        String sql = "update pk_topic set title=? ,content = ?,titleimg=?,userId = ?, publishtime =NOW() where id=?";
        return update(sql,title,content,titleimg,userId);
    }

    @Override
    public int delete(Integer id) {
        String sql = "delete from pk_topic where id=?";
        return update(sql,id);
    }

    @Override
    public Page<pk_topic> findTopic(Page<pk_topic> page) {
        String totalRecodeSql="select count(*) from pk_topic";
        //书总数
        long totalRecodeL= 0;

        totalRecodeL = (long) this.getSingleValue(totalRecodeSql);

        int totalRecode= (int) totalRecodeL;
        page.setTotalRecord(totalRecode);
        //页面显示行数
        int pageSize=page.getPageSize();
        //偏移索引值
        int index=page.getIndex();

        String listSql="select * from pk_topic limit ?,?";
        List<pk_topic> list=this.getListBean(listSql,index,pageSize);

        page.setData(list);
        return page;

    }
}
