package com.pinker.entity;

public class Friend {
    private Integer userId;//用户id
    private Integer friendId;//好友id
    private String remark;//备注
    private Integer statue;//0为好友邀请，1为好友关系

    /**
     * 存放用户，好友实体

     */
    private pk_user user;

    private pk_user friend;

    public Integer getStatue() {
        return statue;
    }

    public void setStatue(Integer statue) {
        this.statue = statue;
    }

    public pk_user getUser() {
        return user;
    }

    public void setUser(pk_user user) {
        this.user = user;
    }

    public pk_user getFriend() {
        return friend;
    }

    public void setFriend(pk_user friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "userId=" + userId +
                ", friendId=" + friendId +
                ", remark='" + remark + '\'' +
                ", statue=" + statue+'\''+
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getFriendId() {
        return friendId;
    }

    public void setFriendId(Integer friendId) {
        this.friendId = friendId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Friend() {

    }

    public Friend(Integer userId, Integer friendId, String remark,Integer statue) {

        this.userId = userId;
        this.friendId = friendId;
        this.remark = remark;
        this.statue=statue;
    }
}
