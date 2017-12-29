package com.pinker.dao;



import com.pinker.util.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 带泛型的实体类
 * 谁做增删改查谁继承BaseDao
 * 写法举例:public class pk_user extends BaseDao<pk_user>
 *
 * @param <T>
 */
public class BaseDao<T> {

    QueryRunner run = new QueryRunner();
    private Class<T> type;

    public BaseDao(){
        //UserDao extends BaseDao<pk_user>
        //获取当前类的带泛型的父类
        ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
        //获取泛型的具体的类，返回值为一个数组
        //数组里的对象只有一个，所以只取第一个就行
        Type[] types = pt.getActualTypeArguments();
        this.type = (Class<T>) types[0];
    }

    //通用的增删改方法
    public int update(String sql, Object... args) {
        int count = 0;
        Connection con = JDBCUtils.getConnection();
        try {
            count = run.update(con, sql, args);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭连接
            JDBCUtils.close(null, null, con);
        }
        return count;
    }

    //通用的查询一个的方法
    public T getBean(String sql, Object... args) {
        T t = null;
        //连接数据库
        Connection con = JDBCUtils.getConnection();
        try {
            //调用工具类的查询一个的方法
            t = run.query(con, sql, new BeanHandler<>(type), args);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭连接
            JDBCUtils.close(null, null, con);
        }
        return t;
    }

    //通用的查询多个的方法
    public List<T> getListBean(String sql, Object... args) {
        List<T> list = new ArrayList<>();
        //连接数据库
        Connection con = JDBCUtils.getConnection();
        try {
            //调用工具类的查询多个的方法
            list = run.query(con, sql, new BeanListHandler<>(type), args);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭连接
            JDBCUtils.close(null, null, con);
        }
        return list;
    }

    public Object getSingleValue(String sql, Object... args){
        Object object=null;
        Connection conn=null;
        try {
            conn= JDBCUtils.getConnection();
            //ScalarHandler()查询第一行第一列的值
            object= run.query(conn, sql, new ScalarHandler(), args);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(null,null,conn);
        }
        return object;
    }
}
