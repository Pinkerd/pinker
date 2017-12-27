package com.pinker.dao;


import com.pinker.entity.Permission;

import java.util.List;

public interface PermissionDao {

   int insertPerm(Permission permission);

   Permission selectOnePerm(Permission permission);

   List<Permission> selectAllPerm();

}
