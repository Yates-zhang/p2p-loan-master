package com.vanguard.p2p.base.domain;

import com.vanguard.p2p.base.BaseDomain;

import java.util.Date;

/**
 * @Descripe 用户角色管理实体类
 * @Author vanguard
 * @Date: 2018/02/05
 * @Version 1.0
 *
 */
public class UserRole extends BaseDomain {

    /**
     * 角色ID
     */
	private Long roleId;
    /**
     * 用户ID
     */
	private Long userId;
    /**
     * 创建时间
     */
	private Date createTime;
    /**
     * 创建者
     */
	private String createBy;


}
