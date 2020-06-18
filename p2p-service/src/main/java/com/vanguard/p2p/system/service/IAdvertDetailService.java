package com.vanguard.p2p.system.service;


import com.vanguard.p2p.base.domain.AdvertDetail;
import com.vanguard.p2p.pojo.P2PResult;
import com.vanguard.p2p.pojo.PageResult;

import java.util.List;

/**
 * 
* 项目名称：morning-online-facade   
* 类名称：IAdvertDetailService   
* 类描述：AdvertDetail / 广告位管理表 业务逻辑层接口    
* 创建人：陈星星   
* 创建时间：2017年4月10日 上午12:31:56   
*
 */
public interface IAdvertDetailService {
	
	/**
	 * 创建广告详情,更新广告位数量
	 * @param advertDetail 广告详情信息
	 * @param userName 操作人
	 * @return
	 */
	P2PResult insertAdvertDetail(AdvertDetail advertDetail, String userName);
	
	/**
	 * 根据广告位ID查找显示广告列表
	 * @param advertId 广告位ID
	 * @return
	 */
	List<AdvertDetail> listByAdvertId(Long advertId);
	
	/**
	 * 根据广告ID/分页信息/搜索内容查找导航列表
	 * @param advertId 广告ID
	 * @param currentPage 第几页
	 * @param pageSize 每页显示数量
	 * @param search 搜索内容
	 * @return
	 */
	PageResult<AdvertDetail> listByPage(Long advertId, Integer currentPage, Integer pageSize, String search);
	
	/**
	 * 更新广告详情状态
	 * @param advertDetailId 广告详情ID
	 * @return
	 */
	P2PResult updateStatus(Long advertDetailId);
	
	/**
	 * 更新广告详情信息
	 * @param advertDetail 广告详情信息
	 * @param userName 操作人
	 * @return
	 */
	P2PResult updateNavigationBar(AdvertDetail advertDetail, String userName);
	
	/**
	 * 根据广告详情ID删除广告详情,同时更新广告位数量
	 * @param advertDetailId 广告详情ID
	 * @return
	 */
	P2PResult deleteByadvertDetailId(Long advertDetailId);
	
}
