package com.pinker.dao.daoImpl;
import com.pinker.dao.UserDao;
import com.pinker.dao.impl.UserDaoImpl;
import com.pinker.entity.User;
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
        List<User> all = ud.findAll();
        System.out.println(all);
    }*/


    @Test
    public void findByUserName() throws Exception {
        List<User> user2 = ud.findByUserName("user2");
        System.out.println(user2);
    }

    @Test
    public void findByUserId() throws Exception {
        User byUserId = ud.findByUserId(1);
        System.out.println(byUserId);
    }
    @Test
    public void findUsersByResidence() throws Exception {
        User User = new User(2,"user1","111111","user1","user1@qq.com",1L,1L,new Date(),new Date(),"address2","school1","male",new Date(),"aries","cintroduction1","header1");
        List<User> usersByResidence = ud.findUsersByResidence(User);
        System.out.println(usersByResidence);
    }

    @Test
    public void findUsersBySchool() throws Exception {
        User User = new User(1,"user1","111111","user1","user1@qq.com",1L,1L,new Date(),new Date(),"address1","school1","male",new Date(),"aries","cintroduction1","header1");
        List<User> usersBySchool = ud.findUsersBySchool(User);
        System.out.println(usersBySchool);
    }

    @Test
    public void login() throws Exception {
        User user1 = ud.login("user1", "123456");
        User user11 = ud.login("user1", "111111");
        System.out.println(user1);
        System.out.println(user11);
    }


    @Test
    public void updateUser() throws Exception {
        User User = new User(1,"user1","123456","user1","user1@qq.com",1L,1L,new Date(),new Date(),"address1","firstschool","male",new Date(),"aries","cintroduction1","header1");
        boolean b = ud.updateUser(User);
        System.out.println(b);
    }

    @Test
    public void addUser() throws Exception {
      /*  User User = new User(null,"user1","111111","user1","user1@qq.com",1L,1L,new Date(),new Date(),"address1","school1","male",new Date(),"aries","cintroduction1","header1");
        User pk_user2 = new User(null,"user2","222222","user2","user2@qq.com",2L,2L,new Date(),new Date(),"address2","school2","male",new Date(),"aries","cintroduction2","header2");*/

        boolean b = ud.addUser("asd1","111111",new Date());
        System.out.println(b);
    }

}