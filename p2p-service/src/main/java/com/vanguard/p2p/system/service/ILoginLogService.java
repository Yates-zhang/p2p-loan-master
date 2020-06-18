package com.vanguard.p2p.system.service;

import com.vanguard.p2p.base.domain.UserLoginLog;
import com.vanguard.p2p.pojo.PageResult;

/**
 * @author vanguard
 * @version 1.0
 * @descripe UserLoginLog / 管理员登陆表 业务逻辑层接口
 * @date: 2018-02-08
 */
public interface ILoginLogService {
	
	/**
	 * 根据用户ID查找管理员登录日志列表
	 * @param userId 用户ID
	 * @param currentPage 第几页
	 * @param pageSize 每页显示数量
	 * @param search 搜索内容
	 * @return
	 */
	PageResult<UserLoginLog> listByUserId(Long userId, Integer currentPage, Integer pageSize, String search);
}
