package com.vanguard.p2p.business.service;

import com.vanguard.p2p.base.vo.UserVO;
import com.vanguard.p2p.business.domain.Member;
import com.vanguard.p2p.business.domain.MemberLoginLog;
import com.vanguard.p2p.exception.ValidateException;
import com.vanguard.p2p.pojo.P2PResult;


/**
 * @author vanguard
 * @version 1.0
 * @descripe Member / 会员用户表 业务逻辑层接口
 * @date: 2018-02-08
 */
public interface IUserService {
	
	/**
	 * 注册用户
	 * @param user 用户信息
	 * @exception ValidateException 验证异常
	 * @return
	 */
	P2PResult register(Member user) throws ValidateException;
	
	/**
	 * 根据登录名查找用户信息
	 * @param userName 手机号码/邮箱
	 * @return
	 */
	Member getByUserName(String userName);
	
	/**
	 * 根据邮箱获取用户信息
	 * @param email 电子邮箱
	 * @return
	 */
	Member getByEmail(String email);
	
	/**
	 * 根据用户ID获取用户显示信息
	 * @param userId 用户ID
	 * @return
	 */
	UserVO getById(Long userId);
	
	/**
	 * 更新用户登录日志
	 * @param memId 用户ID
	 * @param memberLoginLog 用户登录日志
	 * @return
	 */
	P2PResult updateLogById(Long memId, MemberLoginLog memberLoginLog);
	
	/**
	 * 通过邮箱激活账号
	 * @param email 邮箱号码
	 * @return
	 */
	P2PResult updateEmailActive(String email);

	/**
	 * 根据用户ID查询邮箱验证信息，判断用户是否进行邮箱激活
	 * @param userId
	 * @return 邮箱激活 0=未激活/1=已激活',
	 */
	public Integer getEmailIsActive(Long userId);
	
	/**
	 * 通过邮箱完善个人信息
	 * @param email 邮箱
	 * @param telephone 手机号码
	 * @param realName 真实姓名
	 * @exception ValidateException 验证异常
	 * @return
	 */
	P2PResult updatePerfectUser(String email, String telephone, String realName) throws ValidateException;
	
	/**
	 * 通过邮箱重置登录密码
	 * @param loginPassword 登录密码
	 * @param email 电子邮箱
	 * @return
	 */
	P2PResult updatePasswordByEmail(String loginPassword, String email);

}
