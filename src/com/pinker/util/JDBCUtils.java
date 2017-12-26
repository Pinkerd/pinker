package com.pinker.util;


import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.*;

/**
 * 工具类：连接数据库、关闭连接
 */
public class JDBCUtils {
    //连接数据库
    public static Connection getConnection() {
        Connection con = null;
        DataSource source = new ComboPooledDataSource("c3p0Config");
        try {
            con = source.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
    //关闭连接
    public static void close(ResultSet rs, PreparedStatement ps, Connection con) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
