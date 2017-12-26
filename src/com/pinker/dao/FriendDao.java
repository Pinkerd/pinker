package com.pinker.dao;

import com.pinker.entity.Friend;

import java.util.List;

public interface FriendDao {
    Friend selectOneFriByFriendId(Friend friend);

    List<Friend> selectAllFri();

    int insertFri(Friend friend);

    Friend selectOneByUserId(Friend friend);
}
