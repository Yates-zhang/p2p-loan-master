package com.vanguard.p2p.system.service;


import com.vanguard.p2p.base.domain.Log;
import com.vanguard.p2p.pojo.PageResult;

/**
 * @author vanguard
 * @version 1.0
 * @descripe Log / 日志记录表 业务逻辑层接口
 * @date: 2018-02-08
 */
public interface ILogService {
	
	/**
	 * 根据分页信息/搜索内容查找日志记录列表
	 * @param currentPage 第几页
	 * @param pageSize 每页显示数量
	 * @param search 搜索内容
	 * @return
	 */
	PageResult<Log> listByPage(Integer currentPage, Integer pageSize, String search);
	
}
