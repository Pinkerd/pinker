package com.pinker.service;


import com.pinker.entity.Role;

import java.util.List;

public interface RoleService {
    Role getRoleById(Role role);

    List<Role> getAll();

}
