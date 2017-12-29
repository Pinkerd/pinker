package com.pinker.entity;


import java.util.Date;

/**
 * pk_blog的实体类
 */
public class Blog {
    private Integer id;
    private String title;//标题
    private String content;//内容
    private String titleimg;//标题图
    private Date publishtime;//发布时间
    private Integer ueserId;//用户id
    private Integer topicId;//话题id

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public pk_user getUser() {
        return user;
    }

    public void setUser(pk_user user) {
        this.user = user;
    }

    public pk_topic getTopic() {
        return topic;
    }

    public void setTopic(pk_topic topic) {
        this.topic = topic;
    }

    /**
     * 存放 用户，话题实体
     */
    private pk_user user;
    private pk_topic topic;

    public Blog() {
    }

    public Blog(Integer id, String title, String content, String titleimg, Date publishtime, Integer ueserId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.titleimg = titleimg;
        this.publishtime = publishtime;
        this.ueserId = ueserId;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", titleimg='" + titleimg + '\'' +
                ", publishtime=" + publishtime +
                ", ueserId=" + ueserId +
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

    public Date getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }

    public Integer getUeserId() {
        return ueserId;
    }

    public void setUeserId(Integer ueserId) {
        this.ueserId = ueserId;
    }
}
