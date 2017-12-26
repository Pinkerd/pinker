package com.pinker.entity;

public class Role {
    private Integer id;
    private String rolename;
    private Integer permissionId;

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", rolename='" + rolename + '\'' +
                ", permissionId=" + permissionId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public Role(Integer id, String rolename, Integer permissionId) {

        this.id = id;
        this.rolename = rolename;
        this.permissionId = permissionId;
    }
}
