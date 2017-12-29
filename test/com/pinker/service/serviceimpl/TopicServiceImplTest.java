package com.pinker.service.serviceimpl;

import com.pinker.entity.pk_topic;
import com.pinker.service.TopicService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopicServiceImplTest {
    @Test
    void selectOne() {
        TopicService ts = new TopicServiceImpl();
       pk_topic topic = ts.selectOne(3);
       System.out.println(topic.getUser());

    }

}