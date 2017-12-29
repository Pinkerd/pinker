package com.pinker.service.serviceimpl;


import com.pinker.dao.UserDao;
import com.pinker.dao.impl.TopicDaoImpl;
import com.pinker.dao.impl.UserDaoImpl;
import com.pinker.entity.Page;
import com.pinker.entity.pk_topic;
import com.pinker.entity.pk_user;
import com.pinker.service.TopicService;

import java.util.List;

/**
 * 话题服务实现
 */
public class TopicServiceImpl  implements TopicService {
    TopicDaoImpl tdi = new TopicDaoImpl();
    UserDao userDao=new UserDaoImpl();


    /**
     * 填充用户对象
     * @param topic
     */
    private void setFull(pk_topic topic){
        pk_user user=userDao.findByUserId(topic.getUserId());
        topic.setUser(user);
    }


    /**
     * 查询一个
     * @param id
     * @return
     */
    @Override
    public pk_topic selectOne(Integer id) {
        pk_topic topic= tdi.selectOne(id);
        this.setFull(topic);
        return topic;
    }

    /**
     * 查询所有(轻易不用)
     * @return
     */
    @Override
    public List<pk_topic> selectAll() {
        List<pk_topic> list = tdi.selectAll();
         for (pk_topic topic:list){
             this.setFull(topic);
         }
        return list;
    }

    /**
     * 增加话题
     * @param title
     * @param content
     * @param titleimg
     * @param userId
     * @return
     */
    @Override
    public int add(String title, String content, String titleimg, Integer userId) {
        return tdi.add(title,content,titleimg,userId);
    }


    /**
     * 话题更新
     * @param title
     * @param content
     * @param titleimg
     * @param userId
     * @return
     */
    @Override
    public int change(String title,String content,String titleimg,Integer userId) {
        return tdi.change(title,content,titleimg,userId);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @Override
    public int delete(Integer id) {
        return tdi.delete(id);
    }

    /**
     * 分页查询
     * @param page
     * @return
     */
    @Override
    public Page<pk_topic> findTopic(Page<pk_topic> page) {
        page=tdi.findTopic(page);
        for (pk_topic topic:page.getData()) {
            this.setFull(topic);
        }
        return page;
    }
}
