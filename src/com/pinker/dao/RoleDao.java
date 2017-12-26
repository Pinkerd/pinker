package com.pinker.dao;

import com.pinker.entity.Role;

import java.util.List;

public interface RoleDao {
    Role selectOne(Role role);

    List<Role> selectAll();

    int insert(Role role);
}
