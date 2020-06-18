package com.vanguard.p2p.base.domain;

import com.vanguard.p2p.base.BaseDomain;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @Descripe 角色实体类
 * @Author vanguard
 * @Date: 2018/02/05
 * @Version 1.0
 *
 */
@Setter@Getter
public class Role extends BaseDomain {

	/**
	 * 角色名称
	 */
	private String roleName;
	/**
	 * 角色标志
	 */
	private String roleSign;
	/**
	 * 系统数据 1=是,只有超级管理员能修改/0=否,`
	 */
	private Integer isSystem;
	/**
	 * 状态 0=冻结/1=正常
	 */
	private Integer status;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 创建者
	 */
	private String createBy;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 更新者
	 */
	private String updateBy;
	/**
	 * 备注信息
	 */
	private String remarks;

}