package com.pinker.service.Impl;

import com.pinker.dao.impl.UserDaoImpl;
import com.pinker.entity.Page;
import com.pinker.entity.pk_user;
import com.pinker.service.UserService;

import java.util.Date;
import java.util.List;

/**
 * Created by Aries.Gu on 2017/12/26.
 */

public class UserServiceImpl implements UserService {

    UserDaoImpl userDao=new UserDaoImpl();

    @Override//注册 添加新用户  test  pass
    public boolean add(String loginName, String  password, Date createtime) {
        boolean b = userDao.addUser(loginName,password,createtime);
        return b;
    }

    @Override//修改资料 更新信息  test  pass
    public boolean update(pk_user pkuser) {
        boolean b = userDao.updateUser(pkuser);
        return b;
    }

    @Override//登陆 根据登录名和密码登陆  test  pass
    public pk_user login(String loginName, String password) {
        pk_user login = userDao.login(loginName, password);
        return login;
    }

    @Override//好友推荐 寻找相同学校的人  test  pass
    public List<pk_user> findUsersBySchool(pk_user pkuser) {
        List<pk_user> usersBySchool = userDao.findUsersBySchool(pkuser);
        return usersBySchool;
    }

    @Override//好友推荐 寻找相同居住地的人  test  pass
    public List<pk_user> findUsersByResidence(pk_user pkuser) {
        List<pk_user> usersByResidence = userDao.findUsersByResidence(pkuser);
        return usersByResidence;
    }

    @Override//根据id查询用户  test  pass
    public pk_user findByUserId(Integer id) {
        pk_user byUserId = userDao.findByUserId(id);
        return byUserId;
    }

    @Override//根据姓名查询用户  test  pass
    public List<pk_user> findByUserName(String name) {
        List<pk_user> byUserName = userDao.findByUserName(name);
        return byUserName;
    }

    @Override//显示列表 查询所有用户  test  pass
    public List<pk_user> all(int status) {
        List<pk_user> all = userDao.findAll(status);
        return all;
    }

    @Override//根据id删除用户  test  pass
    public boolean freeze(Integer status,Integer id) {
        boolean b = userDao.freezeUserById(status,id);
        return b;
    }

    @Override//分页的方法
    public Page<pk_user> findUser(String pageNumber, int pageSize,Integer status) {
        /*pageNumber传进来转换成int 如果用户输入错误  默认1*/
        int pn=1;   //默认在第一页
        try {
            //将传入的String类型转换成int
            //如果输入abc则会报错
            pn = Integer.parseInt(pageNumber);
        } catch (Exception e) {
        }

        Page<pk_user> page=new  Page<pk_user>();
        page.setPageNumber(pn);         //设置当前页
        page.setPageSize(pageSize);    //设置每页几个

        return userDao.findUser(page,status);
    }
}
