package com.pinker.entity;

public class Permission {
    private Integer roleId;
    private Integer isadmin;
    private Integer isvip;

    public Permission() {
    }

    @Override
    public String toString() {
        return "Permission{" +
                "roleId=" + roleId +
                ", isadmin=" + isadmin +
                ", isvip=" + isvip +
                '}';
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(Integer isadmin) {
        this.isadmin = isadmin;
    }

    public Integer getIsvip() {
        return isvip;
    }

    public void setIsvip(Integer isvip) {
        this.isvip = isvip;
    }

    public Permission(Integer roleId, Integer isadmin, Integer isvip) {

        this.roleId = roleId;
        this.isadmin = isadmin;
        this.isvip = isvip;
    }
}
