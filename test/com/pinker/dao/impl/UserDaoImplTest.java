package com.pinker.dao.impl;

import com.pinker.dao.UserDao;
import com.pinker.entity.Page;
import com.pinker.entity.User;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * Created by Aries.Gu on 2017/12/26.
 */

public class UserDaoImplTest {



    UserDao ud=new UserDaoImpl();
    @Test
    public void findUser() throws Exception {
        Page<User> page = new Page<User>();
        page.setPageNumber(1);
        page.setPageSize(10);

        Page<User> user = ud.findUser(page,1);
        List<User> date = page.getDate();

        for(User user1:date){
            System.out.println(user1);
        }
    }


    @Test
    public void addUser() throws Exception {
        boolean asdasd = ud.addUser("asdasd", "123123",new Date());
        System.out.println(asdasd);
    }

}