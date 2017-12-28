package com.pinker.service.serviceimpl;

import com.pinker.dao.daoImpl.UserDaoImpl;
import com.pinker.entity.pk_user;
import com.pinker.service.UserService;

import java.util.List;

/**
 * Created by Aries.Gu on 2017/12/26.
 */

public class UserServiceImpl implements UserService {

    UserDaoImpl userDao=new UserDaoImpl();

    @Override//注册 添加新用户  test  pass
    public boolean add(pk_user pkuser) {
        boolean b = userDao.addUser(pkuser);
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
    public List<pk_user> all() {
        List<pk_user> all = userDao.findAll();
        return all;
    }

    @Override//根据id删除用户  test  pass
    public boolean delete(Integer id) {
        boolean b = userDao.deleteUserById(id);
        return b;
    }
}
