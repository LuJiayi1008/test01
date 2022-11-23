package com.longIt.mapper;

import java.util.List;

import com.longIt.pojo.Role;

public interface RoleMapper {

	/**
	 * 获取角色列表
	 * @return
	 */
	List<Role> findByRoleAll();
}
