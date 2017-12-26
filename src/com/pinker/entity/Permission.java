package com.pinker.entity;

public class Permission {
    private Integer id;
    private boolean isadmin;
    private boolean isvip;

    public Permission() {
    }

    @Override
    public String toString() {
        return "PermissionDao{" +
                "id=" + id +
                ", isadmin=" + isadmin +
                ", isvip=" + isvip +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isIsadmin() {
        return isadmin;
    }

    public void setIsadmin(boolean isadmin) {
        this.isadmin = isadmin;
    }

    public boolean isIsvip() {
        return isvip;
    }

    public void setIsvip(boolean isvip) {
        this.isvip = isvip;
    }

    public Permission(Integer id, boolean isadmin, boolean isvip) {

        this.id = id;
        this.isadmin = isadmin;
        this.isvip = isvip;
    }

}
