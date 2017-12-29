package com.pinker.servlet;

import com.pinker.dao.BlogDao;
import com.pinker.dao.impl.BlogDaoImpl;
import com.pinker.entity.Blog;
import com.pinker.entity.pk_user;
import com.pinker.service.BlogDaoService;
import com.pinker.service.Impl.BlogDaoServiceImpl;
import com.pinker.util.WEBUtils;
import sun.applet.Main;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "BlogServlet",urlPatterns = ("/BlogServlet"))
public class BlogServlet extends BaseServlet {
    BlogDao blogDao = new BlogDaoImpl();
    BlogDaoService blogDaoService=new BlogDaoServiceImpl();
    protected void selectblogOne(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Blog blog= WEBUtils.para2bean(request,Blog.class);
        Blog blogById = blogDao.getBlogById(blog.getId());
        request.setAttribute("key",blogById);
        request.getRequestDispatcher("/pinker/blog.jsp").forward(request,response);
    }
    protected void selectuserOne(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Blog blogById = blogDaoService.getBlogById(13);
        pk_user user = blogById.getUser();
        System.out.print(user);
    }

    /**
     * 查询所有
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Blog> allBlog = blogDaoService.getAllBlog();
        System.out.print(allBlog);
        request.setAttribute("list",allBlog);
        request.getRequestDispatcher("/pinker/topic_blogList.jsp").forward(request,response);
    }
}
