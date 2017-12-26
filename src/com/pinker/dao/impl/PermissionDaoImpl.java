package com.pinker.dao.impl;

import com.pinker.dao.BaseDao;
import com.pinker.dao.PermissionDao;
import com.pinker.entity.Permission;

import java.util.List;

public class PermissionDaoImpl extends BaseDao<Permission> implements PermissionDao{


    @Override
    public int insertPerm(Permission permission) {
        String sql="insert into permission (isadmin,isvip)values(?,?)";
        return this.update(sql,permission.getIsadmin(),permission.getIsvip());
    }

    @Override
    public Permission selectOnePerm(Permission permission) {
        String sql="selecrt * from permission where id=?";
        return this.getBean(sql,permission.getId());
    }

    @Override
    public List<Permission> selectAllPerm() {
        String sql="select * from permission ";
        return this.getListBean(sql);
    }
}
