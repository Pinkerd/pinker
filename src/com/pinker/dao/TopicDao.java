package com.pinker.dao;


import com.pinker.entity.pk_topic;

import java.util.Date;
import java.util.List;

public interface TopicDao {
    public pk_topic selectOne(Integer id);
    public List<pk_topic> selectAll();
    public int add(String title, String content, String titleimg, Integer userId);
    public int change(String title, String content, String titleimg, Integer userId);
    public int delete(Integer id);
}
