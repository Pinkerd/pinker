package com.pinker.dao;

import com.pinker.entity.Friend;

import java.util.List;

public interface FriendDao {
    Friend selectOneFri(Friend friend);

    List<Friend> selectAllFri();

    int insertFri(Friend friend);
}
