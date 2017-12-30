package com.pinker.servlet;

import com.pinker.entity.Page;
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
 * user管理servlet
 * function：
 * 1.根据登录名和密码登陆    done
 * 2.注册 添加新用户         done
 * 3.修改资料 更新信息       done
 * 4.好友推荐 寻找相同学校的人
 * 5.好友推荐 寻找相同居住地的人
 * 6.根据id查询用户          done
 * 7.根据姓名查询用户        done
 * 8.白名单                  done
 * 9.黑名单                  done
 * 10.冻结/解冻方法          done
 */

@WebServlet(name = "UsersServlet",urlPatterns = ("/UsersServlet"))
public class UsersServlet extends BaseServlet {
    UserServiceImpl usi=new UserServiceImpl();

    /*1.登陆 根据登录名和密码登陆*/
    protected void logIn(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("jump into logIn...");

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        pk_user login = usi.login(username, password);
        System.out.println(login);
    }
    /*2.注册 添加新用户*/
    protected void saveUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("jump into saveUser...");

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String passwordAg = request.getParameter("passwordAg");
        Date date = new Date();
        boolean add = usi.add(username, password, date);
        System.out.println("add:  "+add);

    }
    /*3.修改资料 更新信息*/
    protected void updateUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    /*4.好友推荐 寻找相同学校的人*/
    protected void school(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("jump into same school...");
    }
    /*5.好友推荐 寻找相同居住地的人*/
    protected void residence(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("jump into same residence...");
    }
    /*6.根据id查询用户*/
    protected void findId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("jump into findId...");

        String num = request.getParameter("byId");
        Integer byId = Integer.valueOf(num);

        pk_user byUserId = usi.findByUserId(byId);
        ArrayList<pk_user> list=new ArrayList<pk_user>();
        list.add(byUserId);

        request.setAttribute("userlist",list);
        request.getRequestDispatcher("pinker/pages/userResult.jsp").forward(request,response);
    }
    
    /*7.根据姓名查询用户*/
    protected void findName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("jump into findName...");

        String byName = request.getParameter("byName");

        List<pk_user> list = usi.findByUserName(byName);

        request.setAttribute("userlist",list);
        request.getRequestDispatcher("pinker/pages/userResult.jsp").forward(request,response);
    }

    /*8.白名单*/
    //分页信息的方法
    protected void findUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取页面传入的当前页
        String pageNumber = req.getParameter("pageNumber");

        //设置每页显示的条数
        int pageSize=10;
        //调用finduser方法
        Page<pk_user> page = usi.findUser(pageNumber, pageSize,1);
        //将查询到的信息放进域中
        req.setAttribute("page",page);

        //转发到bookmanagger页面
        req.getRequestDispatcher("pinker/pages/userManager.jsp").forward(req,resp);
    }
    /*9.黑名单*/
    //分页信息的方法
    protected void blackList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取页面传入的当前页
        String pageNumber = req.getParameter("pageNumber");

        //设置每页显示的条数
        int pageSize=10;
        //调用finduser方法
        Page<pk_user> page = usi.findUser(pageNumber, pageSize,0);
        //将查询到的信息放进域中
        req.setAttribute("page",page);

        //转发到bookmanagger页面
        req.getRequestDispatcher("pinker/pages/userUnfreeze.jsp").forward(req,resp);
    }
    /*10.冻结、解冻的方法*/
    protected void freezeUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("jump into freezeUser...");
        //获取id
        String num = request.getParameter("id");
        Integer id = Integer.valueOf(num);
        System.out.println(id);
        //获取状态参数
        String num2 = request.getParameter("status");
        Integer freeze = Integer.valueOf(num2);
        //执行冻结、解冻操作
        boolean delete = usi.freeze(freeze,id);

        if(freeze==1){
            //如果从黑名单 解冻  跳转去黑名单
            response.sendRedirect(request.getContextPath()+"/UsersServlet?method=blackList");
        }else{
            //如果从白名单 冻结  跳转去白名单
            response.sendRedirect(request.getContextPath()+"/UsersServlet?method=findUser");
        }
    }



}
