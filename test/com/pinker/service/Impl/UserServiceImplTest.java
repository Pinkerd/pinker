package com.pinker.service.Impl;

import com.pinker.entity.Page;
import com.pinker.entity.User;
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
    public void findUser() throws Exception {
        Page<User> page = us.findUser("1",10,0); //第一页  每页三个
        List<User> date = page.getDate();
        for(User user:date){
            System.out.println(user);
        }


    }



    @Test
    public void add() throws Exception {
//        User User = new User(4,"user4","444444","user4","user4@qq.com",1L,1L,new Date(),new Date(),"address2","school2","male",new Date(),"aries","cintroduction4","header4");
        boolean add = us.add("sss","ssssss",new Date());
        System.out.println(add);
    }

    @Test
    public void update() throws Exception {
        User User = new User(4,"user4","123123","user4","user4@qq.com",1L,1L,new Date(),new Date(),"address2","school2","male",new Date(),"aries","cintroduction4","header4");
        boolean update = us.update(User);
        System.out.println(update);
    }

    @Test
    public void login() throws Exception {
        User user1 = us.login("user1", "123456");
        System.out.println(user1);
    }

    @Test
    public void findUsersBySchool() throws Exception {
        User User = new User(4,"user4","123123","user4","user4@qq.com",1L,1L,new Date(),new Date(),"address2","school2","male",new Date(),"aries","cintroduction4","header4");
        List<User> usersBySchool = us.findUsersBySchool(User);
        System.out.println(usersBySchool);
    }

    @Test
    public void findUsersByResidence() throws Exception {
        User User = new User(4,"user4","123123","user4","user4@qq.com",1L,1L,new Date(),new Date(),"address2","school2","male",new Date(),"aries","cintroduction4","header4");
        List<User> usersByResidence = us.findUsersByResidence(User);
        System.out.println(usersByResidence);
    }

    @Test
    public void findByUserId() throws Exception {
        User byUserId = us.findByUserId(4);
        System.out.println(byUserId);
    }

    @Test
    public void findByUserName() throws Exception {
        List<User> user2 = us.findByUserName("user2");
        System.out.println(user2);
    }

/*
    @Test
    public void all() throws Exception {
        List<User> all = us.all();
        System.out.println(all);
    }
*/

/*    @Test
    public void delete() throws Exception {
        boolean delete = us.delete(4);
        System.out.println(delete);
    }*/

}