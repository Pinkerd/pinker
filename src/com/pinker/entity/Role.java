package com.pinker.entity;

public class Role {
    private Integer id;
    private String rolename;
    private Permission permission;

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", rolename='" + rolename + '\'' +
                ", permission=" + permission +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
        this.permission.setRoleId(id);
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    public Role() {

    }

    public Role(Integer id, String rolename) {

        this.id = id;
        this.rolename = rolename;
        this.permission.setRoleId(id);
    }
}
