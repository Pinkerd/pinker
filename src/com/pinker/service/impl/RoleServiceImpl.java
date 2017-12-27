package com.pinker.service.impl;

import com.pinker.dao.PermissionDao;
import com.pinker.dao.RoleDao;
import com.pinker.dao.impl.PermissionDaoImpl;
import com.pinker.dao.impl.RoleDaoImpl;
import com.pinker.entity.Permission;
import com.pinker.entity.Role;
import com.pinker.service.RoleService;

import java.util.List;

public class RoleServiceImpl implements RoleService {

    RoleDao roleDao=new RoleDaoImpl();
    PermissionDao permissionDao=new PermissionDaoImpl();
    @Override
    public Role getRoleById(Role role) {
        Role reRole=roleDao.selectOneRol(role);
        Permission permission=permissionDao.selectOnePerm(reRole.getPermission());
        reRole.setPermission(permission);

        return reRole;
    }

    @Override
    public List<Role> getAll() {
        return roleDao.selectAllRol();
    }
}
