package com.pinker.service.serviceImpl;

import com.pinker.entity.pk_user;
import com.pinker.service.UserService;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * Created by Aries.Gu on 2017/12/26.
 */

public class UserServiceImplTest {

    UserService us=new UserServiceImpl();

    @Test
    public void add() throws Exception {
        pk_user pk_user = new pk_user(4,"user4","444444","user4","user4@qq.com",1L,1L,new Date(),new Date(),"address2","school2","male",new Date(),"aries","cintroduction4","header4");
        boolean add = us.add(pk_user);
        System.out.println(add);
    }

    @Test
    public void update() throws Exception {
        pk_user pk_user = new pk_user(4,"user4","123123","user4","user4@qq.com",1L,1L,new Date(),new Date(),"address2","school2","male",new Date(),"aries","cintroduction4","header4");
        boolean update = us.update(pk_user);
        System.out.println(update);
    }

    @Test
    public void login() throws Exception {
        pk_user user1 = us.login("user1", "123456");
        System.out.println(user1);
    }

    @Test
    public void findUsersBySchool() throws Exception {
        pk_user pk_user = new pk_user(4,"user4","123123","user4","user4@qq.com",1L,1L,new Date(),new Date(),"address2","school2","male",new Date(),"aries","cintroduction4","header4");
        List<com.pinker.entity.pk_user> usersBySchool = us.findUsersBySchool(pk_user);
        System.out.println(usersBySchool);
    }

    @Test
    public void findUsersByResidence() throws Exception {
        pk_user pk_user = new pk_user(4,"user4","123123","user4","user4@qq.com",1L,1L,new Date(),new Date(),"address2","school2","male",new Date(),"aries","cintroduction4","header4");
        List<com.pinker.entity.pk_user> usersByResidence = us.findUsersByResidence(pk_user);
        System.out.println(usersByResidence);
    }

    @Test
    public void findByUserId() throws Exception {
        pk_user byUserId = us.findByUserId(4);
        System.out.println(byUserId);
    }

    @Test
    public void findByUserName() throws Exception {
        List<pk_user> user2 = us.findByUserName("user2");
        System.out.println(user2);
    }

    @Test
    public void all() throws Exception {
        List<pk_user> all = us.all();
        System.out.println(all);
    }

    @Test
    public void delete() throws Exception {
        boolean delete = us.delete(4);
        System.out.println(delete);
    }

}