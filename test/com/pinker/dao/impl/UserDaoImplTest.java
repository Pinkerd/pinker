package com.pinker.dao.impl;

import com.pinker.dao.UserDao;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by Aries.Gu on 2017/12/26.
 */

public class UserDaoImplTest {

    UserDao ud=new UserDaoImpl();
    @Test
    public void addUser() throws Exception {
        boolean asdasd = ud.addUser("asdasd", "123123",new Date());
        System.out.println(asdasd);
    }

}