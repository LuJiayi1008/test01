package com.longIt.service;

import java.util.List;

import com.longIt.pojo.Role;

public interface RoleService {
	/**
	 * 获取角色列表
	 * @return
	 */
	List<Role> findByRoleAll();
}
