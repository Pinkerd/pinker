package com.pinker.dao.impl;

import com.pinker.dao.BaseDao;
import com.pinker.dao.FriendDao;
import com.pinker.entity.Friend;

import java.util.List;

public class FriendDaoImpl extends BaseDao<Friend> implements FriendDao {
    @Override
    public Friend selectOneFriByFriendId(Friend friend) {
        String sql= "select * from friend where friendId=?";
        return this.getBean(sql,friend.getFriendId());
    }

    @Override
    public List<Friend> selectAllFri() {
        String sql="select * from friend";
        return this.getListBean(sql);
    }


    @Override
    public int insertFri(Friend friend) {
        String sql="insert into friend values(?,?,?)";

        return this.update(sql,friend.getUserId(),friend.getFriendId(),friend.getRemark());
    }

    @Override
    public Friend selectOneByUserId(Friend friend) {
        String sql="select * from where UserId=?";
        return this.selectOneByUserId(friend);
    }
}
