package com.pinker.dao.impl;

import com.pinker.dao.BaseDao;
import com.pinker.dao.RoleDao;
import com.pinker.entity.Role;

import java.util.List;

public class RoleDaoImpl extends BaseDao<Role> implements RoleDao {
    @Override
    public Role selectOne(Role role) {
        String sql="select * from pk_role where id=?";

        return this.getBean(sql,role.getId());
    }

    @Override
    public List<Role> selectAll() {
        return null;
    }

    @Override
    public int insert(Role role) {
        return 0;
    }
}
