package com.pinker.dao.impl;

import com.pinker.dao.BaseDao;
import com.pinker.dao.PermissionDao;
import com.pinker.entity.Permission;

import java.util.List;

public class PermissionDaoImpl extends BaseDao<Permission> implements PermissionDao {
    @Override
    public int insertPerm(Permission permission) {
        String sql="insert into pk_permission values(?,?,?)";

        return this.update(sql,permission.getRoleId(),permission.getIsadmin(),permission.getIsvip());
    }

    @Override
    public Permission selectOnePerm(Permission permission) {

        String sql="select * from pk_permission where roleId=?";
        return this.getBean(sql,permission.getRoleId());
    }

    @Override
    public List<Permission> selectAll() {
        String sql="select * from pk_permission";
        return this.getListBean(sql);
    }
}
