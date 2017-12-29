package com.pinker.service;

import com.pinker.entity.Page;
import com.pinker.entity.User;

import java.util.Date;
import java.util.List;

/**
 * Created by Aries.Gu on 2017/12/26.
 */

public interface UserService {
    //用户功能
    /*注册 添加新用户*/
    public boolean add(String loginName, String  password, Date createtime);
    /*修改资料 更新信息*/
    public boolean update(User pkuser);
    /*登陆 根据登录名和密码登陆*/
    public User login(String loginName, String password);
    /*好友推荐 寻找相同学校的人*/
    public List<User> findUsersBySchool(User pkuser);
    /*好友推荐 寻找相同居住地的人*/
    public List<User> findUsersByResidence(User pkuser);
    //公用功能
    /*根据id查询用户*/
    public User findByUserId(Integer id);
    /*根据姓名查询用户*/
    public  List<User> findByUserName(String name);

    //管理员功能
    /*显示列表 查询所有用户*/
    public List<User> all(int status);
    /*根据id删除用户*/
    public boolean freeze(Integer status,Integer id);

    /*查询user类分页信息的方法*/
    Page<User> findUser(String pageNumber , int pageSize, Integer status);
}
