package com.longIt.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.longIt.mapper.RoleMapper;
import com.longIt.pojo.Role;
import com.longIt.service.RoleService;


@Service("roleService")
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleMapper roleMapper;
	
	public void setRoleMapper(RoleMapper roleMapper) {
		this.roleMapper = roleMapper;
	}

	public List<Role> findByRoleAll() {
		return roleMapper.findByRoleAll();
	}

}
