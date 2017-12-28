package com.pinker.entity;

/***
 * pk_comment的实体类
 */

import java.util.Date;

public class Comment {
    /**
     * 博客id
     */
    private Integer blogId;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 博客内容
     */
    private String content;
    /**
     * 发布时间
     */
    private Date publishtime;

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public pk_user getUser() {
        return user;
    }

    public void setUser(pk_user user) {
        this.user = user;
    }

    /**
     * 存放博客，用户实体

     */
    private Blog blog;
    private pk_user user;



    public Comment() {
    }

    public Comment(Integer blogId, Integer userId, String content, Date publishtime) {
        this.blogId = blogId;
        this.userId = userId;
        this.content = content;
        this.publishtime = publishtime;
    }

    public Integer getBlogId() {

        return blogId;
    }

    public void setBlogId(Integer blogId) {

        this.blogId = blogId;
    }

    public Integer getUserId() {

        return userId;
    }

    public void setUserId(Integer userId) {

        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {

        this.content = content;
    }

    public Date getPublishtime() {

        return publishtime;
    }

    public void setPublishtime(Date publishtime) {

        this.publishtime = publishtime;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "blogId=" + blogId +
                ", userId=" + userId +
                ", content='" + content + '\'' +
                ", publishtime=" + publishtime +
                '}';
    }
}
