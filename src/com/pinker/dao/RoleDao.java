package com.pinker.dao;

import com.pinker.entity.Role;

import java.util.List;

public interface RoleDao {
    Role selectOneRol(Role role);

    List<Role> selectAllRol();

    int insertRol(Role role);
}
