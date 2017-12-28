package com.pinker.entity;

import java.util.List;

public class Page<T> {
    private List<T> data;//显示数据集合
    private int pageNum;//当前页码
    private int totalPage;//总页数
    private int totalRecord;//总记录数
    private int pageSize;//每页显示条数
    private int index;//开始索引

    @Override
    public String toString() {
        return "Page{" +
                "data=" + data +
                ", pageNum=" + pageNum +
                ", totalPage=" + totalPage +
                ", totalRecord=" + totalRecord +
                ", pageSize=" + pageSize +
                ", index=" + index +
                '}';
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    /**
     * 页码，当页码小于0是设为1
     * 当页码大于总页数时设置为总页数
     * @return
     */
    public int getPageNum() {
        if(pageNum<0){
            pageNum= 1;
    }
        if(pageNum>this.getTotalPage()){
            pageNum= getTotalPage();
        }
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    /**
     * 总页数为总记录数除每页记录数ceil
     * @return
     */
    public int getTotalPage() {
        return this.totalRecord%this.pageSize==0?this.totalRecord/this.pageSize:this.totalRecord/this.pageSize+1;
    }



    public int getTotalRecord() {
        return this.totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getIndex() {
        return (this.pageNum-1)*this.pageSize;
    }


    public Page() {

    }

    public Page(List<T> data, int pageNum, int totalPage, int totalRecord, int pageSize, int index) {

        this.data = data;
        this.pageNum = pageNum;
        this.totalPage = totalPage;
        this.totalRecord = totalRecord;
        this.pageSize = pageSize;
        this.index = index;
    }
}
