package com.pinker.servlet;

import com.pinker.entity.pk_user;
import com.pinker.service.Impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Aries.Gu on 2017/12/26.
 */

@WebServlet(name = "UsersServlet",urlPatterns = ("/UsersServlet"))
public class UsersServlet extends BaseServlet {
    UserServiceImpl usi=new UserServiceImpl();

    /*登陆 根据登录名和密码登陆*/
    protected void logIn(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("jump into logIn...");

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        pk_user login = usi.login(username, password);
        System.out.println(login);
    }
    /*注册 添加新用户*/
    protected void saveUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("jump into saveUser...");

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String passwordAg = request.getParameter("passwordAg");
        Date date = new Date();
        boolean add = usi.add(username, password, date);
        System.out.println("add:  "+add);

    }
    /*修改资料 更新信息*/
    protected void updateUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    /*好友推荐 寻找相同学校的人*/
    protected void school(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    /*好友推荐 寻找相同居住地的人*/
    protected void residence(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    /*根据id查询用户*/
    protected void findId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("jump into findId...");

        String num = request.getParameter("byId");
        Integer byId = Integer.valueOf(num);
        System.out.println("获取到的id值"+byId);
        pk_user byUserId = usi.findByUserId(byId);
        ArrayList<pk_user> list=new ArrayList<pk_user>();
        list.add(byUserId);
        System.out.println("根据id查询的结果"+list);

        request.setAttribute("userlist",list);
        request.getRequestDispatcher("pinker/pages/userResult.jsp").forward(request,response);
    }
    /*根据姓名查询用户*/
    protected void findName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("jump into findName...");

        String byName = request.getParameter("byName");
        System.out.println("获取到的name值"+byName);
        List<pk_user> list = usi.findByUserName(byName);
        System.out.println("根据name查询的结果"+list);

        request.setAttribute("userlist",list);
        request.getRequestDispatcher("pinker/pages/userResult.jsp").forward(request,response);
    }
    /*显示列表 查询所有用户*/
    protected void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("jump into findAll...");

        List<pk_user> all = usi.all();
        System.out.println(all);
        request.setAttribute("userlist",all);
        request.getRequestDispatcher("pinker/pages/userManager.jsp").forward(request,response);
    }
    /*根据id删除用户*/
    protected void deleteUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("jump into deleteUser...");

        String num = request.getParameter("id");
        Integer id = Integer.valueOf(num);
        System.out.println(id);
        boolean delete = usi.delete(id);

        List<pk_user> all = usi.all();
        request.setAttribute("userlist",all);
        request.getRequestDispatcher("pinker/pages/userManager.jsp").forward(request,response);

    }
}
