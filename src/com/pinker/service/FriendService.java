package com.pinker.service;

import com.pinker.entity.Friend;
import com.pinker.entity.Page;

public interface FriendService {
    /**
     * 通过userID查询该用户所有好友信息
     * @param page
     * @param friend
     * @return
     */
    Page<Friend> findFriendByUserId(Page<Friend> page, Friend friend);


    /**
     * 新建好友关系
     */
    boolean beFriend(Friend friend);
}
