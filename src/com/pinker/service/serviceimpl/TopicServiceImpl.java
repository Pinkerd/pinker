package com.pinker.service.serviceimpl;


import com.pinker.dao.BaseDao;
import com.pinker.dao.UserDao;
import com.pinker.dao.impl.TopicDaoImpl;
import com.pinker.dao.impl.UserDaoImpl;
import com.pinker.entity.Page;
import com.pinker.entity.pk_topic;
import com.pinker.entity.pk_user;
import com.pinker.service.TopicService;

import java.util.List;

public class TopicServiceImpl extends BaseDao<pk_topic> implements TopicService {
    TopicDaoImpl tdi = new TopicDaoImpl();
    UserDao userDao=new UserDaoImpl();

    private void setFull(pk_topic topic){
        pk_user user=userDao.findByUserId(topic.getUserId());
        topic.setUser(user);
    }

    @Override
    public pk_topic selectOne(Integer id) {
        pk_topic topic= tdi.selectOne(id);
        this.setFull(topic);
        return topic;
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

    @Override
    public Page<pk_topic> findTopic(Page<pk_topic> page) {
        page=tdi.findTopic(page);
        for (pk_topic topic:page.getData()) {
            this.setFull(topic);
        }
        return page;
    }
}
