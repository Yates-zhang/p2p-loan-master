package com.vanguard.p2p.system.service;


import com.vanguard.p2p.base.domain.Role;
import com.vanguard.p2p.pojo.PageResult;

import java.util.List;

/**
 * @author vanguard
 * @version 1.0
 * @descripe Role / 角色表 业务逻辑层接口
 * @date: 2018-02-08
 */
public interface IRoleService {
	
	/**
	 * 创建角色信息及角色权限
	 * @param role 角色信息
	 * @param menuIds 用户授权ID
	 * @param userName 操作人
	 * @return
	 */
	Integer insertRole(Role role, String[] menuIds, String userName);
	
	/**
	 * 根据角色状态查找角色列表
	 * @param status 角色状态
	 * @return List<Role> 
	 */
	List<Role> listBySataus(Integer status);
	
	/**
	 * 根据分页信息/搜索内容查找角色列表
	 * @param currentPage 第几页
	 * @param pageSize 每页显示数量
	 * @param search 搜索内容
	 * @return
	 */
	PageResult<Role> listByPage(Integer currentPage, Integer pageSize, String search);
	
	/**
	 * 更新角色状态
	 * @param roleId 角色ID
	 * @return
	 */
	Integer updateStatus(Long roleId);
	
	/**
	 * 更新角色信息以及角色权限
	 * @param role 角色信息
	 * @param menuIds 用户授权ID
	 * @param userName 操作人
	 * @return
	 */
	Integer updateRole(Role role, String[] menuIds, String userName);
	
	/**
	 * 根据角色ID删除角色,同时删除角色记录
	 * @param roleId
	 * @return
	 */
	Integer deleteByRoleId(Long roleId);
}
