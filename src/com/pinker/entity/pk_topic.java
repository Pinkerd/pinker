package com.pinker.entity;

import java.util.Date;

public class pk_topic {
    private Integer id;//话题标题
    private  String title;//标题
    private String content;//内容
    private String titleimg;//标题路径
    private Integer userId;//用户ID
    private Date publishtime;//发布时间

    /**
     * 存放用户实体
     */
    private pk_user user;

    public pk_topic() {
    }

    public pk_user getUser() {
        return user;
    }

    public void setUser(pk_user user) {
        this.user = user;
    }

    public pk_topic(Integer id, String title, String content, String titleimg, Integer userId, Date publishtime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.titleimg = titleimg;
        this.userId = userId;
        this.publishtime = publishtime;
    }

    @Override
    public String toString() {
        return "pk_topic{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", titleimg='" + titleimg + '\'' +
                ", userId=" + userId +
                ", publishtime=" + publishtime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitleimg() {
        return titleimg;
    }

    public void setTitleimg(String titleimg) {
        this.titleimg = titleimg;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }
}
