package com.vanguard.p2p.system.service;


import com.vanguard.p2p.base.domain.Navigation;
import com.vanguard.p2p.pojo.PageResult;

/**
 * 
* 项目名称：morning-online-facade   
* 类名称：INavigationService   
* 类描述：Navigation / 导航表 业务逻辑层接口   
* 创建人：陈星星   
* 创建时间：2017年4月8日 下午8:53:33   
*
 */
public interface INavigationService {
	
	/**
	 * 创建导航
	 * @param navigation 导航信息
	 * @param userName 操作人
	 * @return
	 */
	Integer insertNavigation(Navigation navigation, String userName);
	
	/**
	 * 根据分页信息/搜索内容查找导航列表
	 * @param currentPage 第几页
	 * @param pageSize 每页显示数量
	 * @param search 搜索内容
	 * @return
	 */
	PageResult<Navigation> listByPage(Integer currentPage, Integer pageSize, String search);
	
	/**
	 * 更新导航状态
	 * @param navigationId 导航ID
	 * @return
	 */
	Integer updateStatus(Long navigationId);
	
	/**
	 * 更新导航信息
	 * @param navigation 导航信息
	 * @param userName 操作人
	 * @return
	 */
	Integer updateNavigation(Navigation navigation, String userName);
	
	/**
	 * 根据导航ID删除导航,以及删除导航下导航栏
	 * @param navigationId 导航ID
	 * @return
	 */
	Integer deleteByNavigationId(Long navigationId);

	

}
