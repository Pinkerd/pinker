package com.pinker.servlet;

import com.pinker.dao.BlogDao;
import com.pinker.dao.impl.BlogDaoImpl;
import com.pinker.entity.Blog;
import sun.applet.Main;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "BlogServlet",urlPatterns = ("/BlogServlet"))
public class BlogServlet extends BaseServlet {
    BlogDao blogDao = new BlogDaoImpl();
    protected void selectOne(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Blog blogById = blogDao.getBlogById(6);
        request.setAttribute("key",blogById);
        request.getRequestDispatcher("/pinker/blog.jsp").forward(request,response);
    }
}
