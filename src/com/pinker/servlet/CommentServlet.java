package com.pinker.servlet;

import com.pinker.entity.Comment;
import com.pinker.service.CommentService;
import com.pinker.service.serviceimpl.CommentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CommentServlet")
public class CommentServlet extends HttpServlet {
    private CommentService com =new CommentServiceImpl();

    /**
     * 查询全部的评论
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    
}
