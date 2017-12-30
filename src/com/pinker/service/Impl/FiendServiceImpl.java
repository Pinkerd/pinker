package com.pinker.service.Impl;

import com.pinker.dao.FriendDao;
import com.pinker.dao.UserDao;
import com.pinker.dao.impl.FirendDaoImpl;
import com.pinker.dao.impl.UserDaoImpl;
import com.pinker.entity.Friend;
import com.pinker.entity.Page;
import com.pinker.entity.pk_user;
import com.pinker.service.FriendService;

public class FiendServiceImpl implements FriendService {
    UserDao userDao=new UserDaoImpl();
    FriendDao friendDao=new FirendDaoImpl();

    /**
     * 填充用户，好友用户实体
     * @param friend
     */
    private void setFull(Friend friend){
        pk_user user=userDao.findByUserId(friend.getUserId());
        pk_user friendUser=userDao.findByUserId(friend.getFriendId());

        friend.setUser(user);
        friend.setFriend(friendUser);
    }


    /**
     * 交换userID,friendIdy以实现相互添加
     * @param friend
     */
    private void swapFriend(Friend friend){
        int temp=friend.getUserId();
        friend.setUserId(friend.getFriendId());
        friend.setFriendId(temp);
    }

    /**
     * 通过userID查询该用户所有好友信息
     * @param page
     * @param friend
     * @return
     */
    @Override
    public Page<Friend> findFriendByUserId(Page<Friend> page, Friend friend) {
        Page<Friend> friendPage=friendDao.findFriendByUserId(friend,page);
        for (Friend frienb:friendPage.getData()) {
            setFull(friend);
        }
        return friendPage;
    }



    /**
     * 新建好友关系
     */
    @Override
    public boolean beFriend(Friend friend) {
        friendDao.updateFri(friend,1);
        this.swapFriend(friend);
        friendDao.insertFri(friend,1);
        return false;
    }

    /**
     * 发送好友请求
     * @param friend
     * @return
     */
    @Override
    public boolean friendRequest(Friend friend) {
        return friendDao.insertFri(friend,1)!=0;
    }

}
