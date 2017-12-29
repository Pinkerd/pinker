package com.pinker.entity;

public class Permission {
    private Integer roleId;
    private boolean isadmin;
    private boolean isvip;


    /**
     * 存放角色实体
     */
    private Role role;

    public Permission() {
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override

    public String toString() {
        return "PermissionDao{" +
                "id=" + roleId +
                ", isadmin=" + isadmin +
                ", isvip=" + isvip +
                '}';
    }

    public Integer getId() {
        return roleId;
    }

    public void setId(Integer id) {
        this.roleId = id;
    }

    public boolean getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(boolean isadmin) {
        this.isadmin = isadmin;
    }

    public boolean getIsvip() {
        return isvip;
    }

    public void setIsvip(boolean isvip) {
        this.isvip = isvip;
    }

    public Permission(Integer id, boolean isadmin, boolean isvip) {

        this.roleId = id;
        this.isadmin = isadmin;
        this.isvip = isvip;
    }

}
