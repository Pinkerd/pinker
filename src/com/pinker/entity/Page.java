package com.pinker.entity;

import java.util.List;

/**
 * Created by Aries.Gu on 2017/12/29
 */
public class Page<T> {
    private int pageNumber;   //  当前页码，需要用户指定，在Servlet中获取
    private int pageSize;   //每页显示的条数，自己或用户指定，在Servlet中设置
    private int totalRecord;   //总记录数，需要从数据库中查询
    private int totalPage;   //总页数，通过计算获取
    private int index ;   // 开始索引，通过getindex获取
    private List<T> date   ;   // 保存要显示的图书的信息

    public int getIndex() {
        index=(getPageNumber()-1)*getPageSize();
        return index;
    }

    public int getTotalPage() {
        if(getTotalRecord() % getPageSize() ==0 ){
            totalPage=getTotalRecord() / getPageSize();
        }else{
            totalPage=getTotalRecord() / getPageSize() + 1;
        }
        return totalPage;
    }

    public int getPageNumber() {
        if(this.pageNumber<1){
            pageNumber=1;
        }
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public List<T> getDate() {
        return date;
    }

    public void setDate(List<T> date) {
        this.date = date;
    }
}
