package com.pinker.entity;


import java.util.Date;

/**
 * pk_blog的实体类
 */
public class Blog {
    private Integer id;
    private String title;
    private String content;
    private String titleimg;
    private Date publishtime;
    private Integer ueserId;

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
