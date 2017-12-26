package com.pinker.entity;

public class Friend {
    private Integer userId;
    private Integer friendId;
    private String remark;

    @Override
    public String toString() {
        return "Friend{" +
                "userId=" + userId +
                ", friendId=" + friendId +
                ", remark='" + remark + '\'' +
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

    public Friend(Integer userId, Integer friendId, String remark) {

        this.userId = userId;
        this.friendId = friendId;
        this.remark = remark;
    }
}
