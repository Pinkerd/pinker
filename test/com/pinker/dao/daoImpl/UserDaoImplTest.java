package com.pinker.dao.daoImpl;
import com.pinker.dao.UserDao;
import com.pinker.dao.impl.UserDaoImpl;
import com.pinker.entity.pk_user;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * Created by Aries.Gu on 2017/12/26.
 */

public class UserDaoImplTest {

    UserDao ud=new UserDaoImpl();
/*
    @Test
    public void deleteUserById() throws Exception {
        boolean b = ud.deleteUserById(4);
        System.out.println(b);
    }
*/


/*    @Test
    public void findAll() throws Exception {
        List<pk_user> all = ud.findAll();
        System.out.println(all);
    }*/


    @Test
    public void findByUserName() throws Exception {
        List<pk_user> user2 = ud.findByUserName("user2");
        System.out.println(user2);
    }

    @Test
    public void findByUserId() throws Exception {
        pk_user byUserId = ud.findByUserId(1);
        System.out.println(byUserId);
    }
    @Test
    public void findUsersByResidence() throws Exception {
        pk_user pk_user = new pk_user(2,"user1","111111","user1","user1@qq.com",1L,1L,new Date(),new Date(),"address2","school1","male",new Date(),"aries","cintroduction1","header1");
        List<com.pinker.entity.pk_user> usersByResidence = ud.findUsersByResidence(pk_user);
        System.out.println(usersByResidence);
    }

    @Test
    public void findUsersBySchool() throws Exception {
        pk_user pk_user = new pk_user(1,"user1","111111","user1","user1@qq.com",1L,1L,new Date(),new Date(),"address1","school1","male",new Date(),"aries","cintroduction1","header1");
        List<com.pinker.entity.pk_user> usersBySchool = ud.findUsersBySchool(pk_user);
        System.out.println(usersBySchool);
    }

    @Test
    public void login() throws Exception {
        pk_user user1 = ud.login("user1", "123456");
        pk_user user11 = ud.login("user1", "111111");
        System.out.println(user1);
        System.out.println(user11);
    }


    @Test
    public void updateUser() throws Exception {
        pk_user pk_user = new pk_user(1,"user1","123456","user1","user1@qq.com",1L,1L,new Date(),new Date(),"address1","firstschool","male",new Date(),"aries","cintroduction1","header1");
        boolean b = ud.updateUser(pk_user);
        System.out.println(b);
    }

    @Test
    public void addUser() throws Exception {
      /*  pk_user pk_user = new pk_user(null,"user1","111111","user1","user1@qq.com",1L,1L,new Date(),new Date(),"address1","school1","male",new Date(),"aries","cintroduction1","header1");
        pk_user pk_user2 = new pk_user(null,"user2","222222","user2","user2@qq.com",2L,2L,new Date(),new Date(),"address2","school2","male",new Date(),"aries","cintroduction2","header2");*/

        boolean b = ud.addUser("asd1","111111",new Date());
        System.out.println(b);
    }

}