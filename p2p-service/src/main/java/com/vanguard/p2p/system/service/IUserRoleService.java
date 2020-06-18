package com.vanguard.p2p.system.service;


import com.github.pagehelper.PageInfo;
import com.vanguard.p2p.base.domain.Role;
import com.vanguard.p2p.base.domain.User;
import com.vanguard.p2p.base.dto.UserRoleDTO;
import com.vanguard.p2p.pojo.PageResult;

import java.util.List;

/**
 * @author vanguard
 * @version 1.0
 * @descripe UserRole / 管理员角色关联表 业务逻辑层接口
 * @date: 2018-02-08
 */
public interface IUserRoleService {
	
	/**
	 * 根据管理员ID查找角色列表 
	 * @param userId 管理员ID
	 * @param status 角色状态
	 * @return
	 */
	UserRoleDTO getByUserId(Long userId, Integer status);
	
	/**
	 * 根据管理员ID查找角色列表
	 * @param userId 管理员ID
	 * @param status 角色状态
	 * @return
	 */
	List<Role> listByUserId(Long userId, Integer status);
	
	/**
	 * 根据角色ID查找管理员列表
	 * @param roleId 角色ID
	 * @param pageInfo 分页信息
	 * @param search 搜索内容
	 * @return
	 */
	PageResult<User> listByRoleId(Long roleId, PageInfo pageInfo, String search);
	
}
