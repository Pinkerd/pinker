package com.pinker.dao;

import com.pinker.entity.Friend;
import com.pinker.entity.Page;

import java.util.List;

public interface FriendDao {
    Friend selectOneFri(Friend friend);

    List<Friend> selectAllFri();

    List<Friend> selectFriendsByUserId(Friend friend);

    int insertFri(Friend friend);

    public Page<Friend> findFriendByUserId(Friend friend, Page<Friend> page);
}
