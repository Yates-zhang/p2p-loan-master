package com.vanguard.p2p.system.service;


import com.vanguard.p2p.base.domain.Email;

/**
 * @author vanguard
 * @version 1.0
 * @descripe Email / 邮箱记录表  业务逻辑层接口
 * @date: 2018-02-08
 */
public interface IEmailService {
	
	/**
	 * 根据邮箱标志查找邮箱
	 * @param emailSign 邮箱标志
	 * @return Email
	 */
	Email getByEmailSign(Long emailSign);
	
	/**
	 * 根据邮箱ID更新邮箱状态
	 * @param emailId 邮箱ID
	 * @param status 邮箱状态
	 * @return
	 */
	Integer updateStatus(Long emailId, Integer status);
	
}
