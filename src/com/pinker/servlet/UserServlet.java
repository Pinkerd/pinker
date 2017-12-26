package com.pinker.servlet;

import com.pinker.service.serviceImpl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Aries.Gu on 2017/12/26.
 */

@WebServlet(name = "UserServlet",urlPatterns = ("/UserServlet"))
public class UserServlet extends BaseServlet {
    UserServiceImpl usl=new UserServiceImpl();
    /*注册 添加新用户*/
    protected void saveUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    /*修改资料 更新信息*/
    protected void updateUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    /*登陆 根据登录名和密码登陆*/
    protected void logIn(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    /*好友推荐 寻找相同学校的人*/
    protected void school(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    /*好友推荐 寻找相同居住地的人*/
    protected void residence(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    /*根据id查询用户*/
    protected void findId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    /*根据姓名查询用户*/
    protected void findName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    /*显示列表 查询所有用户*/
    protected void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    /*根据id删除用户*/
    protected void deleteUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
