package com.pinker.dao.impl;

import com.pinker.dao.BaseDao;
import com.pinker.dao.RoleDao;
import com.pinker.entity.Role;

import java.util.List;

public class RoleDaoImpl extends BaseDao<Role> implements RoleDao {
    @Override
    public Role selectOneRol(Role role) {
        String sql="select * from role where id=?";
        return this.getBean(sql,role.getId());
    }

    @Override
    public List<Role> selectAllRol() {
        String sql="select * from role";
        return this.getListBean(sql);
    }

    @Override
    public int insertRol(Role role) {
        String sql="insert into role (rolename,permissionId)values(?,?)";
        return this.update(sql,role.getRolename(),role.getPermissionId());
    }
}
