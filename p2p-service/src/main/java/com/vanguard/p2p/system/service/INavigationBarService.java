package com.vanguard.p2p.system.service;


import com.vanguard.p2p.base.domain.NavigationBar;
import com.vanguard.p2p.pojo.PageResult;

import java.util.List;

/**
 * @author vanguard
 * @version 1.0
 * @descripe NavigationBar / 导航栏表  业务逻辑层接口
 * @date: 2018-02-08
 */
public interface INavigationBarService {
	
	/**
	 * 创建导航栏,更新导航中导航栏数量
	 * @param navigationBar 导航栏信息
	 * @param userName 操作人
	 * @return
	 */
	Integer insertNavigationBar(NavigationBar navigationBar, String userName);
	
	/**
	 * 根据导航ID查找显示导航栏
	 * @param navigationId 导航ID
	 * @return
	 */
	List<NavigationBar> listByNavigationId(Long navigationId);
	
	/**
	 * 根据导航ID/分页信息/搜索内容查找导航列表
	 * @param navigationId 导航ID
	 * @param currentPage 第几页
	 * @param pageSize 每页显示数量
	 * @param search 搜索内容
	 * @return
	 */
	PageResult<NavigationBar> listByPage(Long navigationId, Integer currentPage, Integer pageSize, String search);
	
	/**
	 * 更新导航栏状态
	 * @param navigationBarId 导航栏ID
	 * @return
	 */
	Integer updateStatus(Long navigationBarId);
	
	/**
	 * 更新导航栏信息
	 * @param navigationBar 导航栏信息
	 * @param userName 操作人
	 * @return
	 */
	Integer updateNavigationBar(NavigationBar navigationBar, String userName);
	
	/**
	 * 根据导航栏ID删除导航栏
	 * @param navigationBarId 导航栏ID
	 * @return
	 */
	Integer deleteByNavigationBarId(Long navigationBarId);
	
}
