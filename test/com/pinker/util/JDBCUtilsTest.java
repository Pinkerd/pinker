package com.pinker.util;

import org.junit.Test;

import java.sql.Connection;

import static org.junit.Assert.*;

/**
 * Created by Aries.Gu on 2017/12/26.
 */

public class JDBCUtilsTest {


    @Test
    public void getConnection() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        System.out.println(connection);
    }


}