package com.vanguard.p2p.system.service;


import com.vanguard.p2p.base.dto.RoleMenuDTO;
import com.vanguard.p2p.base.vo.RoleMenuVO;

import java.util.List;
import java.util.Set;

/**
 * @author vanguard
 * @version 1.0
 * @descripe RoleMenu / 角色目录关联表 业务逻辑层接口
 * @date: 2018-02-08
 */
public interface IRoleMenuService {
	
	/**
	 * 根据角色ID列表查找权限列表
	 * @param roleIds 角色ID列表
	 * @param status 权限状态
	 * @return Set<String>
	 */
	Set<String> getByRolesId(Set<String> roleIds, Integer status);
	
	/**
	 * 根据管理员ID查找系统目录
	 * @param userId 管理员ID
	 * @param status 状态
	 * @return List<RoleMenuVO>
	 */
	List<RoleMenuVO> listByUserId(Long userId, Integer status);
	
	/**
	 * 根据目录状态查找系统目录
	 * @param status 目录状态
	 * @return List<RoleMenuDTO>
	 */
	List<RoleMenuDTO> listRoleMenus(Integer status);
	
	/**
	 * 根据目录状态和角色ID查找目录及其是否选中
	 * @param roleId 角色ID
	 * @param status 目录状态
	 * @return List<RoleMenuVO>
	 */
	List<RoleMenuVO> listCheckedMenus(Long roleId, Integer status);
}
