package com.vanguard.p2p.system.service;


import com.github.pagehelper.PageInfo;
import com.vanguard.p2p.base.domain.Advert;
import com.vanguard.p2p.pojo.PageResult;

/**
 * @author vanguard
 * @version 1.0
 * @descripe Advert / 广告位表 业务逻辑层接口
 * @date: 2018-02-08
 */
public interface IAdvertService {
	
	/**
	 * 创建广告
	 * @param advert 广告信息
	 * @param userName 操作人
	 * @return
	 */
	Integer insertAdvert(Advert advert, String userName);
	
	/**
	 * 根据分页信息/搜索内容查找广告列表
	 * @param pageInfo 分页信息
	 * @param search 搜索内容
	 * @return
	 */
	PageResult<Advert> listByPage(PageInfo pageInfo, String search);
	
	/**
	 * 更新广告状态
	 * @param advertId 广告ID
	 * @return
	 */
	Integer updateStatus(Long advertId);
	
	/**
	 * 更新广告
	 * @param advert 广告信息
	 * @param userName 操作人
	 * @return
	 */
	Integer updateAdvert(Advert advert, String userName);
	
	/**
	 * 根据广告ID删除广告,同时删除广告相信
	 * @param advertId 广告ID
	 * @return
	 */
	Integer deleteByAdvertId(Long advertId);
	
}
