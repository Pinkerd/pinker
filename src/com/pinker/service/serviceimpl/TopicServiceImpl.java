package com.pinker.service.serviceimpl;


import com.pinker.dao.BaseDao;
import com.pinker.dao.impl.TopicDaoImpl;
import com.pinker.entity.pk_topic;
import com.pinker.service.TopicService;

import java.util.List;

public class TopicServiceImpl extends BaseDao<pk_topic> implements TopicService {
    TopicDaoImpl tdi = new TopicDaoImpl();
    @Override
    public pk_topic selectOne(Integer id) {
        return tdi.selectOne(id);
    }

    @Override
    public List<pk_topic> selectAll() {
        return tdi.selectAll();
    }

    @Override
    public int add(String title, String content, String titleimg, Integer userId) {
        return tdi.add(title,content,titleimg,userId);
    }

    @Override
    public int change(String title,String content,String titleimg,Integer userId) {
        return tdi.change(title,content,titleimg,userId);
    }


    @Override
    public int delete(Integer id) {
        return tdi.delete(id);
    }
}
