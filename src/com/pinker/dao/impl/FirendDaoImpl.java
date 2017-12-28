package com.pinker.dao.impl;

import com.pinker.dao.BaseDao;
import com.pinker.dao.FriendDao;
import com.pinker.entity.Friend;
import com.pinker.entity.Page;

import java.awt.print.Book;
import java.util.List;

public class FirendDaoImpl extends BaseDao<Friend> implements FriendDao{

    /**
     * 按用户id，好友id查询一个
     * @param friend
     * @return
     */
    @Override
    public Friend selectOneFri(Friend friend) {
        String sql="select * from pk_friend where userId=? and friendId=?";
        return this.getBean(sql,friend.getUserId(),friend.getFriendId());
    }

    /**
     * 查询所有好友列表
     * @return
     */
    @Override
    public List<Friend> selectAllFri() {
        String sql="select * from pk_friend";
        return this.getListBean(sql);
    }

    /**
     * 按用户id查询该用户所有好友
     * @param friend
     * @return
     */
    @Override
    public List<Friend> selectFriendsByUserId(Friend friend) {

        String sql="select * from pk_friend where userId=?";

        return this.getListBean(sql,friend.getUserId());
    }

    /**
     * 插入用户
     * @param friend
     * @return
     */
    @Override
    public int insertFri(Friend friend) {
        String sql="insert into pk_friend values(?,?,?)";
        return this.update(sql,friend.getUserId(),friend.getFriendId(),friend.getRemark());
    }


    /**
     * 分页查询特定用户de好友
     */
    @Override
    public Page<Friend> findFriendByUserId(Friend friend, Page<Friend> page){
        String totalRecodeSql="select count(*) from pk_friend where userId=?";
        //书总数
        long totalRecodeL= 0;

        totalRecodeL = (long) this.getSingleValue(totalRecodeSql,friend.getUserId());

        int totalRecode= (int) totalRecodeL;
        page.setTotalRecord(totalRecode);
        //页面显示行数
        int pageSize=page.getPageSize();
        //偏移索引值
        int index=page.getIndex();

        String listSql="select * from pk_friend where userId=? limit ?,?";
        List<Friend> list=this.getListBean(listSql,index,pageSize);

        page.setData(list);
        return page;

    }
}
